package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CeshijieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CeshijieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CeshijieguoView;


/**
 * 测试结果
 *
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public interface CeshijieguoService extends IService<CeshijieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CeshijieguoVO> selectListVO(Wrapper<CeshijieguoEntity> wrapper);
   	
   	CeshijieguoVO selectVO(@Param("ew") Wrapper<CeshijieguoEntity> wrapper);
   	
   	List<CeshijieguoView> selectListView(Wrapper<CeshijieguoEntity> wrapper);
   	
   	CeshijieguoView selectView(@Param("ew") Wrapper<CeshijieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CeshijieguoEntity> wrapper);
   	
}

