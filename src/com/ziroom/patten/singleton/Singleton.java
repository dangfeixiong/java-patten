package com.ziroom.patten.singleton;

/**
 * @ClassName: Singleton.java
 * @Description: Java设计模式==>单例模式
 * @author: dfx  
 * @date: 2017年12月17日 下午2:05:50
 */
public class Singleton /*implements Serializable*/ {
	
	/**
	 * 	创建型模式:帮助创建对象
	 * 	单例模式:一个类有且只有一个对象实例
	 *	1.使用场景:资源管理器 回收站 读取配置文件对象 日志应用 数据库连接池
	 *	2.当一个对象的产生需要比较多的资源时，则可以通过应用启动时产生一个单例对象，然后永驻内存的方式来解决。
	 */
	
	//====================//
	//		1.饿汉式	      //
	//====================//


	//定义静态变量
	//1.类加载时天然的线程安全
	//2.效率高
	private static Singleton singleton = new Singleton();
	
	//私有构造方法
	private Singleton() {
		//防止反射获取对象
		if(singleton != null) {
			throw new RuntimeException();
		}
	}
	
	//提供获取对象的方法
	public static Singleton getInstance() {
		return singleton;
	}


/*
	//====================//
	//		2.懒汉式	      //
	//====================//
	
	//定义静态变量
	private static Singleton singleton;
	
	//私有构造方法
	private Singleton() {}
	
	//提供获取对象的方法
	public static synchronized Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
*/
	
	//====================//
	//		3.双重检测锁            //
	//====================//

/*
	//定义静态变量
	private static Singleton singleton;
		
	//私有构造方法
	private Singleton() {}
	
	//提供获取对象的方法
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
	//	   4. 静态内部类            //
	//====================//

/*	
	//私有构造方法
	private Singleton() {}
	
	//内部类(内部类调用时加载)
	private static class SingletonHolder{
		private static final Singleton singleton = new Singleton();
	}
	
	//提供获取对象方法
	public static Singleton getInstance() {
		return SingletonHolder.singleton;
	}
*/
	
	//====================//
	//		5.枚举	      //
	//====================//

/*
	enum Singleton {
		//实例
		INSTANCE;
		//功能处理
		public void singletonOperator() {
			
		}
	}
*/

/*	
	// 无论是实现Serializable接口，或是Externalizable接口，当从I/O流中读取对象时，readResolve()方法都会被调用到。  
    // 实际上就是用readResolve()中返回的对象直接替换在反序列化过程中创建的对象。  
    private Object readResolve() throws ObjectStreamException {    
        return singleton;  
    }
*/

}
