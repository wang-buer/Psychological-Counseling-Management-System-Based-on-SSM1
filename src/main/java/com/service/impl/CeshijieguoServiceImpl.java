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


import com.dao.CeshijieguoDao;
import com.entity.CeshijieguoEntity;
import com.service.CeshijieguoService;
import com.entity.vo.CeshijieguoVO;
import com.entity.view.CeshijieguoView;

@Service("ceshijieguoService")
public class CeshijieguoServiceImpl extends ServiceImpl<CeshijieguoDao, CeshijieguoEntity> implements CeshijieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshijieguoEntity> page = this.selectPage(
                new Query<CeshijieguoEntity>(params).getPage(),
                new EntityWrapper<CeshijieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshijieguoEntity> wrapper) {
		  Page<CeshijieguoView> page =new Query<CeshijieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CeshijieguoVO> selectListVO(Wrapper<CeshijieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshijieguoVO selectVO(Wrapper<CeshijieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshijieguoView> selectListView(Wrapper<CeshijieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshijieguoView selectView(Wrapper<CeshijieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
