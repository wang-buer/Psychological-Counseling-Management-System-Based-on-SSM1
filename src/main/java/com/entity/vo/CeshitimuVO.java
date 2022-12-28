package com.entity.vo;

import com.entity.CeshitimuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 测试题目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-08 11:11:36
 */
public class CeshitimuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
