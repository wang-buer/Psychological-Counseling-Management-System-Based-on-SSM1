package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunshiView;


/**
 * 咨询师
 *
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface ZixunshiService extends IService<ZixunshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunshiVO> selectListVO(Wrapper<ZixunshiEntity> wrapper);
   	
   	ZixunshiVO selectVO(@Param("ew") Wrapper<ZixunshiEntity> wrapper);
   	
   	List<ZixunshiView> selectListView(Wrapper<ZixunshiEntity> wrapper);
   	
   	ZixunshiView selectView(@Param("ew") Wrapper<ZixunshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunshiEntity> wrapper);
   	
}

