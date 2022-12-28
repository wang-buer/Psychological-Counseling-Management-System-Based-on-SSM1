package com.dao;

import com.entity.CeshitimuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshitimuVO;
import com.entity.view.CeshitimuView;


/**
 * 测试题目
 * 
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface CeshitimuDao extends BaseMapper<CeshitimuEntity> {
	
	List<CeshitimuVO> selectListVO(@Param("ew") Wrapper<CeshitimuEntity> wrapper);
	
	CeshitimuVO selectVO(@Param("ew") Wrapper<CeshitimuEntity> wrapper);
	
	List<CeshitimuView> selectListView(@Param("ew") Wrapper<CeshitimuEntity> wrapper);

	List<CeshitimuView> selectListView(Pagination page,@Param("ew") Wrapper<CeshitimuEntity> wrapper);
	
	CeshitimuView selectView(@Param("ew") Wrapper<CeshitimuEntity> wrapper);
	
}
