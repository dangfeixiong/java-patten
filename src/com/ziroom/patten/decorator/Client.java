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
	
	/*
	 * 装饰者模式(Decorator): 又称包装器(Wrapper), 可以动态地为一个对象添加一些额外的职责. 
	 * 就增加功能来说, 装饰者模式是一种用于替代继承的技术, 他无须通过增加子类继承就能扩展对象的已有功能, 
	 * 而是使用对象的关联关系代替继承关系 , 更加灵活, 同时还可避免类型体系的快速膨胀.
	 */

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
