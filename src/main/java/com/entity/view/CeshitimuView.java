package com.entity.view;

import com.entity.CeshitimuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 测试题目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
@TableName("ceshitimu")
public class CeshitimuView  extends CeshitimuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CeshitimuView(){
	}
 
 	public CeshitimuView(CeshitimuEntity ceshitimuEntity){
 	try {
			BeanUtils.copyProperties(this, ceshitimuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
