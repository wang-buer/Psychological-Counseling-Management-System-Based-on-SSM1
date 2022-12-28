package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 测试信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
@TableName("ceshixinxi")
public class CeshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CeshixinxiEntity() {
		
	}
	
	public CeshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 题目
	 */
					
	private String timu;
	
	/**
	 * 答案
	 */
					
	private String daan;
	
	/**
	 * 题目1
	 */
					
	private String timu1;
	
	/**
	 * 答案1
	 */
					
	private String daan1;
	
	/**
	 * 题目2
	 */
					
	private String timu2;
	
	/**
	 * 答案2
	 */
					
	private String daan2;
	
	/**
	 * 题目3
	 */
					
	private String timu3;
	
	/**
	 * 答案3
	 */
					
	private String daan3;
	
	/**
	 * 题目4
	 */
					
	private String timu4;
	
	/**
	 * 答案4
	 */
					
	private String daan4;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：题目
	 */
	public void setTimu(String timu) {
		this.timu = timu;
	}
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
	/**
	 * 设置：答案
	 */
	public void setDaan(String daan) {
		this.daan = daan;
	}
	/**
	 * 获取：答案
	 */
	public String getDaan() {
		return daan;
	}
	/**
	 * 设置：题目1
	 */
	public void setTimu1(String timu1) {
		this.timu1 = timu1;
	}
	/**
	 * 获取：题目1
	 */
	public String getTimu1() {
		return timu1;
	}
	/**
	 * 设置：答案1
	 */
	public void setDaan1(String daan1) {
		this.daan1 = daan1;
	}
	/**
	 * 获取：答案1
	 */
	public String getDaan1() {
		return daan1;
	}
	/**
	 * 设置：题目2
	 */
	public void setTimu2(String timu2) {
		this.timu2 = timu2;
	}
	/**
	 * 获取：题目2
	 */
	public String getTimu2() {
		return timu2;
	}
	/**
	 * 设置：答案2
	 */
	public void setDaan2(String daan2) {
		this.daan2 = daan2;
	}
	/**
	 * 获取：答案2
	 */
	public String getDaan2() {
		return daan2;
	}
	/**
	 * 设置：题目3
	 */
	public void setTimu3(String timu3) {
		this.timu3 = timu3;
	}
	/**
	 * 获取：题目3
	 */
	public String getTimu3() {
		return timu3;
	}
	/**
	 * 设置：答案3
	 */
	public void setDaan3(String daan3) {
		this.daan3 = daan3;
	}
	/**
	 * 获取：答案3
	 */
	public String getDaan3() {
		return daan3;
	}
	/**
	 * 设置：题目4
	 */
	public void setTimu4(String timu4) {
		this.timu4 = timu4;
	}
	/**
	 * 获取：题目4
	 */
	public String getTimu4() {
		return timu4;
	}
	/**
	 * 设置：答案4
	 */
	public void setDaan4(String daan4) {
		this.daan4 = daan4;
	}
	/**
	 * 获取：答案4
	 */
	public String getDaan4() {
		return daan4;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}

}
