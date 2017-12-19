package com.ziroom.patten.prototype;

import java.io.Serializable;

/**
 * 
 * @ClassName WorkExperience
 * @Description 工作经历
 * @author dfx
 * @date 2017年12月19日 上午11:30:43
 */
public class WorkExperience implements Cloneable ,Serializable {
	/**
	 * 工作区间
	 */
	private String timeArea;
	/**
	 * 工作公司
	 */
	private String company;
	/**
	 * 职位
	 */
	private String position;
	/**
	 * 备注
	 */
	private String remark;

	// 有参构造
	public WorkExperience(String timeArea, String company, String position,
			String remark) {
		super();
		this.timeArea = timeArea;
		this.company = company;
		this.position = position;
		this.remark = remark;
	}

	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 克隆
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
