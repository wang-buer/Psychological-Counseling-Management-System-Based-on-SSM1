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
 * 测试题目
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
@TableName("ceshitimu")
public class CeshitimuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CeshitimuEntity() {
		
	}
	
	public CeshitimuEntity(T t) {
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
	 * 题目
	 */
					
	private String timu;
	
	/**
	 * 题目1
	 */
					
	private String timu1;
	
	/**
	 * 题目2
	 */
					
	private String timu2;
	
	/**
	 * 题目3
	 */
					
	private String timu3;
	
	/**
	 * 题目4
	 */
					
	private String timu4;
	
	/**
	 * 测试文件
	 */
					
	private String ceshiwenjian;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 咨询师姓名
	 */
					
	private String zixunshixingming;
	
	
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
	 * 设置：测试文件
	 */
	public void setCeshiwenjian(String ceshiwenjian) {
		this.ceshiwenjian = ceshiwenjian;
	}
	/**
	 * 获取：测试文件
	 */
	public String getCeshiwenjian() {
		return ceshiwenjian;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
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
	 * 设置：咨询师姓名
	 */
	public void setZixunshixingming(String zixunshixingming) {
		this.zixunshixingming = zixunshixingming;
	}
	/**
	 * 获取：咨询师姓名
	 */
	public String getZixunshixingming() {
		return zixunshixingming;
	}

}
