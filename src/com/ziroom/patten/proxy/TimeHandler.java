package com.ziroom.patten.proxy;

import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	// 被代理对象
	private Object target;
	
	public TimeHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public void invoke(Object o, Method method) {
		long start = System.currentTimeMillis();
		System.out.println(o.getClass().getName());	// 代理对象
		try {
			method.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
	}
}
