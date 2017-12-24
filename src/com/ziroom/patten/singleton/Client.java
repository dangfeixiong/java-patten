package com.ziroom.patten.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: SingletonDemo.java
 * @Description: ����ģʽ������
 * @author: dfx  
 * @date: 2017��12��17�� ����3:39:26
 */
public class Client {
	
	public static void main(String[] args) throws Exception {
		Client singletonDemo = new Client();
		//singletonDemo.test01();
		//singletonDemo.test02();
		//singletonDemo.test03();
	}
	
	//ͨ������ֱ�ӵ��ù�����
	public void test01() throws Exception {
		Class<Singleton> clazz = (Class<Singleton>) Class.forName("com.ziroom.patten.singleton.Singleton");
		Constructor<Singleton> instance = clazz.getDeclaredConstructor(null);
		instance.setAccessible(true);	//ȡ��Java��Ȩ�޿��Ƽ��
		System.out.println(instance.newInstance());
		System.out.println(instance.newInstance());
	}
	
	//ͨ�����л��뷴���л������������
	public void test02() throws Exception {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		//���л�
		FileOutputStream fos = new FileOutputStream("d:/ingleton.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);
		oos.close();
		fos.close();
		
		//�����л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/ingleton.txt"));
		Singleton singleton = (Singleton) ois.readObject();
		System.out.println(singleton);
	}
	
	//����һ�����̻߳���
	public void test03() throws InterruptedException {
		long start = System.currentTimeMillis();	//��ʼʱ��
		int threadNum = 10;	//�߳���
		final int singletonNum = 100000;	//������
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		//�����߳�
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
		
		countDownLatch.await();	//�߳�����
		long end = System.currentTimeMillis();	//����ʱ��
		System.out.println("ִ��ʱ��:" + (end - start));
	}

}
