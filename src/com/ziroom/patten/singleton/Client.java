package com.ziroom.patten.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: SingletonDemo.java
 * @Description: 单例模式测试类
 * @author: dfx  
 * @date: 2017年12月17日 下午3:39:26
 */
public class Client {
	
	public static void main(String[] args) throws Exception {
		Client singletonDemo = new Client();
		//singletonDemo.test01();
		//singletonDemo.test02();
		//singletonDemo.test03();
	}
	
	//通过反射直接调用构造器
	public void test01() throws Exception {
		Class<Singleton> clazz = (Class<Singleton>) Class.forName("com.ziroom.patten.singleton.Singleton");
		Constructor<Singleton> instance = clazz.getDeclaredConstructor(null);
		instance.setAccessible(true);	//取消Java的权限控制检查
		System.out.println(instance.newInstance());
		System.out.println(instance.newInstance());
	}
	
	//通过序列化与反序列化创建多个对象
	public void test02() throws Exception {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		//序列化
		FileOutputStream fos = new FileOutputStream("d:/ingleton.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);
		oos.close();
		fos.close();
		
		//反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/ingleton.txt"));
		Singleton singleton = (Singleton) ois.readObject();
		System.out.println(singleton);
	}
	
	//创建一个多线程环境
	public void test03() throws InterruptedException {
		long start = System.currentTimeMillis();	//开始时间
		int threadNum = 10;	//线程数
		final int singletonNum = 100000;	//对象数
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		//创建线程
		for(int i = 1; i <= threadNum; i ++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int j = 1; j <= singletonNum; j ++) {
						Singleton.getInstance();
					}
					
					countDownLatch.countDown();
				}
			}).start();;
		}
		
		countDownLatch.await();	//线程阻塞
		long end = System.currentTimeMillis();	//结束时间
		System.out.println("执行时间:" + (end - start));
	}

}
