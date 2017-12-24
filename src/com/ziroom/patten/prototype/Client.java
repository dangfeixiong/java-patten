package com.ziroom.patten.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description protptype(ԭ��)��������[����һ�������ʱ��Ƚϸ���]
 * @author dfx
 * @date 2017��12��19�� ����11:44:08
 */
public class Client {
	
	@Test
	public void test() throws Exception{
		
		WorkExperience workExperience = new WorkExperience("yyyy-yyyy", "XXX-��˾", "����ʨ", "YYYYYY");
		Resume resume1 = new Resume("����", 23, "��", workExperience);
		
		//1.clone
		Resume resume2 = (Resume) resume1.clone();
		
		System.out.println(resume1);
		System.out.println(resume2);
		
		//2.==========���л�/�����л�(clone)=============
		/*ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(resume1);
        byte[] bytes = bos.toByteArray();
        
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Resume resume2 = (Resume) ois.readObject();*/
		//==========================================
		
		//�޸Ĺ���������Ϣ
		workExperience.setTimeArea("2011-2017");
		workExperience.setCompany("Baidu");
		
		System.out.println(resume1.disPlay());
		
		resume2.setName("����");
		resume2.setAge(19);
		System.out.println(resume2.disPlay());
		
	}
	
	@Test
	public void testEfficiency(){
		testNew(10000);
		testClone(10000);
	}
	
	//new����
	public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
        	WorkExperience workExperience = new WorkExperience("yyyy-yyyy", "XXX-��˾", "����ʨ", "YYYYYY");
    		new Resume("����", 23, "��", workExperience);
        }
        long end = System.currentTimeMillis();
        System.out.println("ͨ��new��ʽ����Ҫ��ʱ��Ϊ:" +(end - start));
    }
 
	//clone����
    public static void testClone(int size) {
        long start = System.currentTimeMillis();
        WorkExperience workExperience = new WorkExperience("yyyy-yyyy", "XXX-��˾", "����ʨ", "YYYYYY");
		Resume resume = new Resume("����", 23, "��", workExperience);
        for (int i = 0; i < size; i++) {
            try {
            	resume.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("ͨ��clone��ʽ����Ҫ��ʱ��Ϊ:" +(end - start));
    }

}
