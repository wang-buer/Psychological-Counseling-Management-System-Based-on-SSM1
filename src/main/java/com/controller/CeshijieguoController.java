package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CeshijieguoEntity;
import com.entity.view.CeshijieguoView;

import com.service.CeshijieguoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 测试结果
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
@RestController
@RequestMapping("/ceshijieguo")
public class CeshijieguoController {
    @Autowired
    private CeshijieguoService ceshijieguoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CeshijieguoEntity ceshijieguo, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			ceshijieguo.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zixunshi")) {
			ceshijieguo.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CeshijieguoEntity> ew = new EntityWrapper<CeshijieguoEntity>();
		PageUtils page = ceshijieguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ceshijieguo), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CeshijieguoEntity ceshijieguo, HttpServletRequest request){
        EntityWrapper<CeshijieguoEntity> ew = new EntityWrapper<CeshijieguoEntity>();
		PageUtils page = ceshijieguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ceshijieguo), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CeshijieguoEntity ceshijieguo){
       	EntityWrapper<CeshijieguoEntity> ew = new EntityWrapper<CeshijieguoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ceshijieguo, "ceshijieguo")); 
        return R.ok().put("data", ceshijieguoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CeshijieguoEntity ceshijieguo){
        EntityWrapper< CeshijieguoEntity> ew = new EntityWrapper< CeshijieguoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ceshijieguo, "ceshijieguo")); 
		CeshijieguoView ceshijieguoView =  ceshijieguoService.selectView(ew);
		return R.ok("查询测试结果成功").put("data", ceshijieguoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        CeshijieguoEntity ceshijieguo = ceshijieguoService.selectById(id);
        return R.ok().put("data", ceshijieguo);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        CeshijieguoEntity ceshijieguo = ceshijieguoService.selectById(id);
        return R.ok().put("data", ceshijieguo);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CeshijieguoEntity ceshijieguo, HttpServletRequest request){
    	ceshijieguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ceshijieguo);

        ceshijieguoService.insert(ceshijieguo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CeshijieguoEntity ceshijieguo, HttpServletRequest request){
    	ceshijieguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ceshijieguo);

        ceshijieguoService.insert(ceshijieguo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CeshijieguoEntity ceshijieguo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ceshijieguo);
        ceshijieguoService.updateById(ceshijieguo);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ceshijieguoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CeshijieguoEntity> wrapper = new EntityWrapper<CeshijieguoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zixunshi")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = ceshijieguoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
