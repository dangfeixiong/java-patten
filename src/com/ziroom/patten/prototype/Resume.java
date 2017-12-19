package com.ziroom.patten.prototype;

import java.io.Serializable;

/**
 * 
 * @ClassName Resume
 * @Description ������
 * @author dfx
 * @date 2017��12��19�� ����11:28:37
 */
public class Resume implements Cloneable, Serializable {
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private int age;
	/**
	 * �Ա�
	 */
	private String sex;
	/**
	 * ��������
	 */
	private WorkExperience workExperience;

	// �вι���
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
	 * ��ʾ����
	 */
	public String disPlay() {
		StringBuilder builder = new StringBuilder();
		builder.append("����:").append(this.name).append("\t");
		builder.append("����:").append(this.age).append("\t");
		builder.append("�Ա�:").append(this.sex).append("\t");
		builder.append("��������:").append("\n");
		builder.append("��������:").append(workExperience.getTimeArea())
				.append("\t");
		builder.append("������˾:").append(workExperience.getCompany())
				.append("\t");
		builder.append("ְλ:").append(workExperience.getPosition()).append("\t");
		builder.append("��ע:").append(workExperience.getRemark()).append("\t");
		return builder.toString();
	}

	/**
	 * ��¡
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume resume = (Resume) super.clone();
		resume.workExperience = (WorkExperience) this.workExperience.clone();
		return resume;
	}
}
