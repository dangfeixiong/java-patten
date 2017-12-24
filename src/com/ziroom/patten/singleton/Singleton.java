package com.ziroom.patten.singleton;

/**
 * @ClassName: Singleton.java
 * @Description: Java���ģʽ==>����ģʽ
 * @author: dfx  
 * @date: 2017��12��17�� ����2:05:50
 */
public class Singleton /*implements Serializable*/ {
	
	/**
	 * 	������ģʽ:������������
	 * 	����ģʽ:һ��������ֻ��һ������ʵ��
	 *	1.ʹ�ó���:��Դ������ ����վ ��ȡ�����ļ����� ��־Ӧ�� ���ݿ����ӳ�
	 *	2.��һ������Ĳ�����Ҫ�Ƚ϶����Դʱ�������ͨ��Ӧ������ʱ����һ����������Ȼ����פ�ڴ�ķ�ʽ�������
	 */
	
	//====================//
	//		1.����ʽ	      //
	//====================//


	//���徲̬����
	//1.�����ʱ��Ȼ���̰߳�ȫ
	//2.Ч�ʸ�
	private static Singleton singleton = new Singleton();
	
	//˽�й��췽��
	private Singleton() {
		//��ֹ�����ȡ����
		if(singleton != null) {
			throw new RuntimeException();
		}
	}
	
	//�ṩ��ȡ����ķ���
	public static Singleton getInstance() {
		return singleton;
	}


/*
	//====================//
	//		2.����ʽ	      //
	//====================//
	
	//���徲̬����
	private static Singleton singleton;
	
	//˽�й��췽��
	private Singleton() {}
	
	//�ṩ��ȡ����ķ���
	public static synchronized Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
*/
	
	//====================//
	//		3.˫�ؼ����            //
	//====================//

/*
	//���徲̬����
	private static Singleton singleton;
		
	//˽�й��췽��
	private Singleton() {}
	
	//�ṩ��ȡ����ķ���
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
*/
	
	//====================//
	//	   4. ��̬�ڲ���            //
	//====================//

/*	
	//˽�й��췽��
	private Singleton() {}
	
	//�ڲ���(�ڲ������ʱ����)
	private static class SingletonHolder{
		private static final Singleton singleton = new Singleton();
	}
	
	//�ṩ��ȡ���󷽷�
	public static Singleton getInstance() {
		return SingletonHolder.singleton;
	}
*/
	
	//====================//
	//		5.ö��	      //
	//====================//

/*
	enum Singleton {
		//ʵ��
		INSTANCE;
		//���ܴ���
		public void singletonOperator() {
			
		}
	}
*/

/*	
	// ������ʵ��Serializable�ӿڣ�����Externalizable�ӿڣ�����I/O���ж�ȡ����ʱ��readResolve()�������ᱻ���õ���  
    // ʵ���Ͼ�����readResolve()�з��صĶ���ֱ���滻�ڷ����л������д����Ķ���  
    private Object readResolve() throws ObjectStreamException {    
        return singleton;  
    }
*/

}
