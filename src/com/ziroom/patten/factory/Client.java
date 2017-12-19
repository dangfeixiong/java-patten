package com.ziroom.patten.factory;

import org.junit.Test;

import com.ziroom.patten.factory.abstractfactory.AbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BenzAbstractFactory;
import com.ziroom.patten.factory.bean.Car;
import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;
import com.ziroom.patten.factory.factorymethod.BYDFactory;
import com.ziroom.patten.factory.factorymethod.BenzFactory;
import com.ziroom.patten.factory.factorymethod.FactoryMethod;
import com.ziroom.patten.factory.simplefactory.SimpleFactory;

/**
 * 
 * @ClassName Client 
 * @Description 汽车专卖店
 * @author dfx
 * @date 2017年12月18日 上午11:23:50
 */
public class Client {
	
	//简单工厂
	@Test
	public void simpleFactory(){
		//1.获取工厂
		SimpleFactory factory = new SimpleFactory();
		//2.获取汽车
		Car benzCar = factory.createCar("BenzCar");	//奔驰
		Client.print(benzCar);
		Car BYDCar = factory.createCar("BYDCar");	//BYD
		Client.print(BYDCar);
	}
	
	//工厂方法
	@Test
	public void factoryMethord(){
		//获取奔驰汽车
		FactoryMethod benzFactory = new BenzFactory();
		Car benzCar = benzFactory.createCar();
		Client.print(benzCar);
		
		//获取比亚迪汽车
		FactoryMethod bydFactory = new BYDFactory();
		Car BYDCar = bydFactory.createCar();
		Client.print(BYDCar);
	}
	
	//抽象工厂
	@Test
	public void abstractFactory(){
		//获取奔驰汽车
		AbstractFactory benzFactory = new BenzAbstractFactory();
		Engine benzEngine = benzFactory.engine();
		Wheel benzWheel = benzFactory.wheel();
		System.out.println("Engine:" + benzEngine.show());
		System.out.println("Wheel:" + benzWheel.show());
		
		//获取比亚迪汽车
		AbstractFactory bydFactory = new BYDAbstractFactory();
		Engine bydEngine = bydFactory.engine();
		Wheel bydWheel = bydFactory.wheel();
		System.out.println("Engine:" + bydEngine.show());
		System.out.println("Wheel:" + bydWheel.show());
	}
	
	
	//分装打印方法
	private static void print(Car car){
		System.out.println("start:" + car.start());
		System.out.println("run:" + car.run());
		System.out.println("stop:" + car.stop());
	}

}
