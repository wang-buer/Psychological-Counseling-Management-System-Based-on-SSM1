package com.dao;

import com.entity.CeshijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshijieguoVO;
import com.entity.view.CeshijieguoView;


/**
 * 测试结果
 * 
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface CeshijieguoDao extends BaseMapper<CeshijieguoEntity> {
	
	List<CeshijieguoVO> selectListVO(@Param("ew") Wrapper<CeshijieguoEntity> wrapper);
	
	CeshijieguoVO selectVO(@Param("ew") Wrapper<CeshijieguoEntity> wrapper);
	
	List<CeshijieguoView> selectListView(@Param("ew") Wrapper<CeshijieguoEntity> wrapper);

	List<CeshijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<CeshijieguoEntity> wrapper);
	
	CeshijieguoView selectView(@Param("ew") Wrapper<CeshijieguoEntity> wrapper);
	
}
