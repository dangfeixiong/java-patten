package com.ziroom.patten.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * 
 * @ClassName: Client.java
 * @Description: 代理模式测试类 
 * @author: dfx
 * @date: 2018年1月7日 上午12:20:21
 */
public class Client {
	/*
	 * 代理模式:
	 *	1.为其他对象提供代理以控制对其他对象的访问
	 *	2.静态代理是由程序员创建或工具生成代理类的源码，再编译代理类。所谓静态也就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。
	 *	3.动态代理是在实现阶段不用关心代理类，而在运行阶段才指定哪一个对象。
	 *	4.设计模式更多的指的是语义而不是语法，语法看起来都很象。
	 *	区别:装饰模式应该为所装饰的对象增强功能；代理模式对代理的对象施加控制，并不提供对象本身的增强功能
	 */
	
	//测试静态代理
	@Test
	public void staticProxy() {
		StaticProxy proxy = new StaticProxy(new Tank());
		proxy.move();
	}
	
	//测试动态代理01
	@Test
	public void dynamicProxy01() throws Exception {
		Movable proxy = (Movable)DynamicProxy01.newProxyInstance();
		proxy.move();
	}
	
	//测试动态代理02
	@Test
	public void dynamicProxy02() throws Exception {
		DynamicProxy02.newProxyInstance(Movable.class);	// implements Movable
		//DynamicProxy02.newProxyInstance(Runnable.class);// implements Runnable
	}
	
	//测试动态代理03
	@Test
	public void dynamicProxy03() throws Exception {
		InvocationHandler handler = new TimeHandler(new Tank());
		Movable m = (Movable)DynamicProxy03.newProxyInstance(Movable.class, handler);	// implements Movable
		m.move();
	}
	
	//测试动JDK态代理
	@Test
	public void jDKDynamicProxy() throws Exception {
		Movable tank = new Tank();
		java.lang.reflect.InvocationHandler handler = new JDKHandler(tank);
		ClassLoader loader = tank.getClass().getClassLoader();
		Class<?>[] interfaces = tank.getClass().getInterfaces();
		Movable m = (Movable)Proxy.newProxyInstance(loader, interfaces, handler);
		m.move();
	}

}
