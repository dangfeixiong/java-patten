package com.ziroom.patten.factory.simplefactory;

import com.ziroom.patten.factory.bean.BYDCar;
import com.ziroom.patten.factory.bean.BenzCar;
import com.ziroom.patten.factory.bean.Car;

/**
 * 
 * @ClassName SimpleFactory 
 * @Description 简单工厂(简单工厂起始不是一种设计模式,而比较像是一种编程习惯)
 * @author dfx
 * @date 2017年12月18日 上午11:18:01
 */
public class SimpleFactory {
	
	//生产汽车
	public Car createCar(String brandType){
		Car car = null;
		if(brandType.equals("BenzCar")){
			car = new BenzCar();
		}else if(brandType.equals("BYDCar")){
			car = new BYDCar();
		}
		return car;
	}
}
