package com.ziroom.patten.decorator;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description 测试(GOF)设计模式--装饰器模式
 * @author dfx
 * @date 2017年12月28日 上午10:11:41
 */
public class Client {

	@Test
	public void move(){
		//基本汽车
		ICar car1 = new Car();
		car1.move();
		
		//扩展汽车
		ICar car2 = new FlyCar(car1);
		car2.move();
		
		//扩展汽车的扩展汽车
		ICar car3 = new WaterCar(car2);
		car3.move();
	}
}
