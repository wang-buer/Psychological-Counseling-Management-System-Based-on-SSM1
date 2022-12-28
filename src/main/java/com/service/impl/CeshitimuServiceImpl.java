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


import com.dao.CeshitimuDao;
import com.entity.CeshitimuEntity;
import com.service.CeshitimuService;
import com.entity.vo.CeshitimuVO;
import com.entity.view.CeshitimuView;

@Service("ceshitimuService")
public class CeshitimuServiceImpl extends ServiceImpl<CeshitimuDao, CeshitimuEntity> implements CeshitimuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshitimuEntity> page = this.selectPage(
                new Query<CeshitimuEntity>(params).getPage(),
                new EntityWrapper<CeshitimuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshitimuEntity> wrapper) {
		  Page<CeshitimuView> page =new Query<CeshitimuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CeshitimuVO> selectListVO(Wrapper<CeshitimuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshitimuVO selectVO(Wrapper<CeshitimuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshitimuView> selectListView(Wrapper<CeshitimuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshitimuView selectView(Wrapper<CeshitimuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
