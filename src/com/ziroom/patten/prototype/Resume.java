package com.ziroom.patten.prototype;

import java.io.Serializable;

/**
 * 
 * @ClassName Resume
 * @Description 简历类
 * @author dfx
 * @date 2017年12月19日 上午11:28:37
 */
public class Resume implements Cloneable, Serializable {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 工作经历
	 */
	private WorkExperience workExperience;

	// 有参构造
	public Resume(String name, int age, String sex, WorkExperience workExperience){
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.workExperience = workExperience;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	/**
	 * 显示简历
	 */
	public String disPlay() {
		StringBuilder builder = new StringBuilder();
		builder.append("姓名:").append(this.name).append("\t");
		builder.append("年龄:").append(this.age).append("\t");
		builder.append("性别:").append(this.sex).append("\t");
		builder.append("工作经历:").append("\n");
		builder.append("工作区间:").append(workExperience.getTimeArea())
				.append("\t");
		builder.append("工作公司:").append(workExperience.getCompany())
				.append("\t");
		builder.append("职位:").append(workExperience.getPosition()).append("\t");
		builder.append("备注:").append(workExperience.getRemark()).append("\t");
		return builder.toString();
	}

	/**
	 * 克隆
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume resume = (Resume) super.clone();
		resume.workExperience = (WorkExperience) this.workExperience.clone();
		return resume;
	}
}
