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

import com.entity.YuyuexinxiEntity;
import com.entity.view.YuyuexinxiView;

import com.service.YuyuexinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 预约信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
@RestController
@RequestMapping("/yuyuexinxi")
public class YuyuexinxiController {
    @Autowired
    private YuyuexinxiService yuyuexinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyuexinxiEntity yuyuexinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zixunshi")) {
			yuyuexinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			yuyuexinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyuexinxiEntity> ew = new EntityWrapper<YuyuexinxiEntity>();
		PageUtils page = yuyuexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuexinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyuexinxiEntity yuyuexinxi, HttpServletRequest request){
        EntityWrapper<YuyuexinxiEntity> ew = new EntityWrapper<YuyuexinxiEntity>();
		PageUtils page = yuyuexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuexinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyuexinxiEntity yuyuexinxi){
       	EntityWrapper<YuyuexinxiEntity> ew = new EntityWrapper<YuyuexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyuexinxi, "yuyuexinxi")); 
        return R.ok().put("data", yuyuexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyuexinxiEntity yuyuexinxi){
        EntityWrapper< YuyuexinxiEntity> ew = new EntityWrapper< YuyuexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyuexinxi, "yuyuexinxi")); 
		YuyuexinxiView yuyuexinxiView =  yuyuexinxiService.selectView(ew);
		return R.ok("查询预约信息成功").put("data", yuyuexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YuyuexinxiEntity yuyuexinxi = yuyuexinxiService.selectById(id);
        return R.ok().put("data", yuyuexinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YuyuexinxiEntity yuyuexinxi = yuyuexinxiService.selectById(id);
        return R.ok().put("data", yuyuexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyuexinxiEntity yuyuexinxi, HttpServletRequest request){
    	yuyuexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuexinxi);

        yuyuexinxiService.insert(yuyuexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyuexinxiEntity yuyuexinxi, HttpServletRequest request){
    	yuyuexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuexinxi);

        yuyuexinxiService.insert(yuyuexinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuyuexinxiEntity yuyuexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyuexinxi);
        yuyuexinxiService.updateById(yuyuexinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyuexinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YuyuexinxiEntity> wrapper = new EntityWrapper<YuyuexinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zixunshi")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuyuexinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
