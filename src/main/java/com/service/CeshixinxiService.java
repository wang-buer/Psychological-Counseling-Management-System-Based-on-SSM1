package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CeshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CeshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CeshixinxiView;


/**
 * 测试信息
 *
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface CeshixinxiService extends IService<CeshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CeshixinxiVO> selectListVO(Wrapper<CeshixinxiEntity> wrapper);
   	
   	CeshixinxiVO selectVO(@Param("ew") Wrapper<CeshixinxiEntity> wrapper);
   	
   	List<CeshixinxiView> selectListView(Wrapper<CeshixinxiEntity> wrapper);
   	
   	CeshixinxiView selectView(@Param("ew") Wrapper<CeshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CeshixinxiEntity> wrapper);
   	
}

