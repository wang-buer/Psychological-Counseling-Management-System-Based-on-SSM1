package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CeshitimuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CeshitimuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CeshitimuView;


/**
 * 测试题目
 *
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface CeshitimuService extends IService<CeshitimuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CeshitimuVO> selectListVO(Wrapper<CeshitimuEntity> wrapper);
   	
   	CeshitimuVO selectVO(@Param("ew") Wrapper<CeshitimuEntity> wrapper);
   	
   	List<CeshitimuView> selectListView(Wrapper<CeshitimuEntity> wrapper);
   	
   	CeshitimuView selectView(@Param("ew") Wrapper<CeshitimuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CeshitimuEntity> wrapper);
   	
}

