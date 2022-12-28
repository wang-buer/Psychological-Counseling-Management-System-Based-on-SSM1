package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZixunshiDao;
import com.entity.ZixunshiEntity;
import com.service.ZixunshiService;
import com.entity.vo.ZixunshiVO;
import com.entity.view.ZixunshiView;

@Service("zixunshiService")
public class ZixunshiServiceImpl extends ServiceImpl<ZixunshiDao, ZixunshiEntity> implements ZixunshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunshiEntity> page = this.selectPage(
                new Query<ZixunshiEntity>(params).getPage(),
                new EntityWrapper<ZixunshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunshiEntity> wrapper) {
		  Page<ZixunshiView> page =new Query<ZixunshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixunshiVO> selectListVO(Wrapper<ZixunshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunshiVO selectVO(Wrapper<ZixunshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunshiView> selectListView(Wrapper<ZixunshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunshiView selectView(Wrapper<ZixunshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
