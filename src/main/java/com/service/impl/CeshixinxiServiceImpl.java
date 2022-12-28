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


import com.dao.CeshixinxiDao;
import com.entity.CeshixinxiEntity;
import com.service.CeshixinxiService;
import com.entity.vo.CeshixinxiVO;
import com.entity.view.CeshixinxiView;

@Service("ceshixinxiService")
public class CeshixinxiServiceImpl extends ServiceImpl<CeshixinxiDao, CeshixinxiEntity> implements CeshixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshixinxiEntity> page = this.selectPage(
                new Query<CeshixinxiEntity>(params).getPage(),
                new EntityWrapper<CeshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshixinxiEntity> wrapper) {
		  Page<CeshixinxiView> page =new Query<CeshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CeshixinxiVO> selectListVO(Wrapper<CeshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshixinxiVO selectVO(Wrapper<CeshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshixinxiView> selectListView(Wrapper<CeshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshixinxiView selectView(Wrapper<CeshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
