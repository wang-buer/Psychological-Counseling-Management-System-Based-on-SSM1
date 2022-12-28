package com.entity.view;

import com.entity.CeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 测试信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
@TableName("ceshixinxi")
public class CeshixinxiView  extends CeshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CeshixinxiView(){
	}
 
 	public CeshixinxiView(CeshixinxiEntity ceshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ceshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
