package com.ziroom.patten.adapter;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description 测试(GOF)设计模式--适配器模式
 * @author dfx
 * @date 2017年12月25日 上午9:57:15
 */
public class Client {
	
	/*
	 * 	作用:将一个类的接口转换成客户希望的另外一个接口(功能作用没有变化,只是实现有变化)
	 * 	1.目标接口（Target）：客户所期待的接口。
	 * 	2.需要适配的类（Adaptee）：需要适配的类或适配者类。
	 * 	3.适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。　　
	 */
	
	@Test
	public void threePlug(){
		//USB转接头
		//Adaptee adaptee = new USBAdaptee();
		//2孔插头转接头
		Adaptee adaptee = new TwoAdaptee();
		Target target = new Adapter(adaptee);
		System.out.println(target.threePlug());
	}
}
