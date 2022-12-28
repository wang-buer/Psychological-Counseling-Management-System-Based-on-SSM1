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


import com.dao.DiscusszixunshiDao;
import com.entity.DiscusszixunshiEntity;
import com.service.DiscusszixunshiService;
import com.entity.vo.DiscusszixunshiVO;
import com.entity.view.DiscusszixunshiView;

@Service("discusszixunshiService")
public class DiscusszixunshiServiceImpl extends ServiceImpl<DiscusszixunshiDao, DiscusszixunshiEntity> implements DiscusszixunshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszixunshiEntity> page = this.selectPage(
                new Query<DiscusszixunshiEntity>(params).getPage(),
                new EntityWrapper<DiscusszixunshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszixunshiEntity> wrapper) {
		  Page<DiscusszixunshiView> page =new Query<DiscusszixunshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszixunshiVO> selectListVO(Wrapper<DiscusszixunshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszixunshiVO selectVO(Wrapper<DiscusszixunshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszixunshiView> selectListView(Wrapper<DiscusszixunshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszixunshiView selectView(Wrapper<DiscusszixunshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
