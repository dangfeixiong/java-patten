package com.ziroom.patten.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description protptype(原型)测试是类[创建一个对象的时候比较复杂]
 * @author dfx
 * @date 2017年12月19日 上午11:44:08
 */
public class Client {
	
	@Test
	public void test() throws Exception{
		
		WorkExperience workExperience = new WorkExperience("yyyy-yyyy", "XXX-公司", "攻城狮", "YYYYYY");
		Resume resume1 = new Resume("张三", 23, "男", workExperience);
		
		//1.clone
		Resume resume2 = (Resume) resume1.clone();
		
		System.out.println(resume1);
		System.out.println(resume2);
		
		//2.==========序列化/反序列化(clone)=============
		/*ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(resume1);
        byte[] bytes = bos.toByteArray();
        
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Resume resume2 = (Resume) ois.readObject();*/
		//==========================================
		
		//修改工作经历信息
		workExperience.setTimeArea("2011-2017");
		workExperience.setCompany("Baidu");
		
		System.out.println(resume1.disPlay());
		
		resume2.setName("李四");
		resume2.setAge(19);
		System.out.println(resume2.disPlay());
		
	}
	
	@Test
	public void testEfficiency(){
		testNew(10000);
		testClone(10000);
	}
	
	//new对象
	public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
        	WorkExperience workExperience = new WorkExperience("yyyy-yyyy", "XXX-公司", "攻城狮", "YYYYYY");
    		new Resume("张三", 23, "男", workExperience);
        }
        long end = System.currentTimeMillis();
        System.out.println("通过new方式所需要的时间为:" +(end - start));
    }
 
	//clone对象
    public static void testClone(int size) {
        long start = System.currentTimeMillis();
        WorkExperience workExperience = new WorkExperience("yyyy-yyyy", "XXX-公司", "攻城狮", "YYYYYY");
		Resume resume = new Resume("张三", 23, "男", workExperience);
        for (int i = 0; i < size; i++) {
            try {
            	resume.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("通过clone方式所需要的时间为:" +(end - start));
    }

}
