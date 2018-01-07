package com.ziroom.patten.proxy;
/**
 * 
 * @ClassName: StaticProxy.java
 * @Description: 代理角色：实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
 * @author: dfx
 * @date: 2018年1月7日 上午12:17:15
 */
public class StaticProxy implements Movable {
	
	private Movable tank;
	
	public StaticProxy(Movable tank) {
		this.tank = tank;
	}

	@Override
	public void move() {
		Long start = System.currentTimeMillis();
		tank.move();
		Long end = System.currentTimeMillis();
		System.out.println("method执行时间为:" + (end - start));
	}

}
