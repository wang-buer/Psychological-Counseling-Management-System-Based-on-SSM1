package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenzhangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenzhangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenzhangxinxiView;


/**
 * 文章信息评论表
 *
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface DiscusswenzhangxinxiService extends IService<DiscusswenzhangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenzhangxinxiVO> selectListVO(Wrapper<DiscusswenzhangxinxiEntity> wrapper);
   	
   	DiscusswenzhangxinxiVO selectVO(@Param("ew") Wrapper<DiscusswenzhangxinxiEntity> wrapper);
   	
   	List<DiscusswenzhangxinxiView> selectListView(Wrapper<DiscusswenzhangxinxiEntity> wrapper);
   	
   	DiscusswenzhangxinxiView selectView(@Param("ew") Wrapper<DiscusswenzhangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenzhangxinxiEntity> wrapper);
   	
}

