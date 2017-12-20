package com.ziroom.patten.factory;

import org.junit.Test;

import com.ziroom.patten.factory.abstractfactory.AbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BenzAbstractFactory;
import com.ziroom.patten.factory.bean.BenzCar;
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
		factory.createCar("BenzCar");	//奔驰
		factory.createCar("BYDCar");	//BYD
	}
	
	//工厂方法
	@Test
	public void factoryMethord(){
		//获取奔驰汽车
		FactoryMethod benzFactory = new BenzFactory();
		benzFactory.createCar();
		
		//获取比亚迪汽车
		FactoryMethod bydFactory = new BYDFactory();
		bydFactory.createCar();
	}
	
	//抽象工厂
	@Test
	public void abstractFactory(){
		//获取奔驰汽车
		AbstractFactory benzFactory = new BenzAbstractFactory();
		benzFactory.engine();
		benzFactory.wheel();
		
		//获取比亚迪汽车
		AbstractFactory bydFactory = new BYDAbstractFactory();
		bydFactory.engine();
		bydFactory.wheel();
	}
	
}
