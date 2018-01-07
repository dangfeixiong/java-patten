package com.ziroom.patten.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKHandler implements InvocationHandler {
	
	// 被代理对象
		private Object target;
		
		public JDKHandler(Object target) {
			this.target = target;
		}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long start = System.currentTimeMillis();
		Object returnValue = method.invoke(target);
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
		return returnValue;
	}

}
