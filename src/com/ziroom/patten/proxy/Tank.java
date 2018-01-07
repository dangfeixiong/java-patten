package com.ziroom.patten.proxy;

import java.util.Random;

/**
 * 
 * @ClassName: Tank.java
 * @Description: 真实角色：实现抽象角色，定义真实角色所要实现的业务逻辑，供代理角色调用。
 * @author: dfx  
 * @date: 2018年1月7日 上午12:15:13
 */
public class Tank implements Movable {
	@Override
	public void move() {
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
