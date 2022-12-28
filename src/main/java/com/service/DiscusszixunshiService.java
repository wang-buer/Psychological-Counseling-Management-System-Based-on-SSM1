package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszixunshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszixunshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszixunshiView;


/**
 * 咨询师评论表
 *
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface DiscusszixunshiService extends IService<DiscusszixunshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszixunshiVO> selectListVO(Wrapper<DiscusszixunshiEntity> wrapper);
   	
   	DiscusszixunshiVO selectVO(@Param("ew") Wrapper<DiscusszixunshiEntity> wrapper);
   	
   	List<DiscusszixunshiView> selectListView(Wrapper<DiscusszixunshiEntity> wrapper);
   	
   	DiscusszixunshiView selectView(@Param("ew") Wrapper<DiscusszixunshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszixunshiEntity> wrapper);
   	
}

