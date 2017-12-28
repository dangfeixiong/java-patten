package com.ziroom.patten.bridge;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description 桥接模式测试类
 * @author dfx
 * @date 2017年12月25日 上午11:13:09
 */
public class Client {
	
	/*
	 * 违背了单一职责原则
	 * 多层继承，类的个数急速膨胀
	 */
	
	@Test
	public void computer01(){
		//戴尔笔记本
		Computer01 computer01 = new DellLaptopComputer01();
		System.out.println(computer01.salary());
	}

	@Test
	public void computer02(){
		//戴尔笔记本
		Computer02 computer02 = new LaptopComputer02(new Dell());
		System.out.println(computer02.salary());
	}
}
