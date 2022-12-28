package com.dao;

import com.entity.DiscusszixunshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszixunshiVO;
import com.entity.view.DiscusszixunshiView;


/**
 * 咨询师评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface DiscusszixunshiDao extends BaseMapper<DiscusszixunshiEntity> {
	
	List<DiscusszixunshiVO> selectListVO(@Param("ew") Wrapper<DiscusszixunshiEntity> wrapper);
	
	DiscusszixunshiVO selectVO(@Param("ew") Wrapper<DiscusszixunshiEntity> wrapper);
	
	List<DiscusszixunshiView> selectListView(@Param("ew") Wrapper<DiscusszixunshiEntity> wrapper);

	List<DiscusszixunshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszixunshiEntity> wrapper);
	
	DiscusszixunshiView selectView(@Param("ew") Wrapper<DiscusszixunshiEntity> wrapper);
	
}
