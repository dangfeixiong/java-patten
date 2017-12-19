package com.ziroom.patten.prototype;

import java.io.Serializable;

/**
 * 
 * @ClassName WorkExperience
 * @Description ��������
 * @author dfx
 * @date 2017��12��19�� ����11:30:43
 */
public class WorkExperience implements Cloneable ,Serializable {
	/**
	 * ��������
	 */
	private String timeArea;
	/**
	 * ������˾
	 */
	private String company;
	/**
	 * ְλ
	 */
	private String position;
	/**
	 * ��ע
	 */
	private String remark;

	// �вι���
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
	 * ��¡
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
