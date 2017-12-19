package com.ziroom.patten.factory.factorymethod;

import com.ziroom.patten.factory.bean.BenzCar;
import com.ziroom.patten.factory.bean.Car;

/**
 * 
 * @ClassName BenzFactory 
 * @Description 制造奔驰汽车的工厂 
 * @author dfx
 * @date 2017年12月18日 下午12:02:45
 */
public class BenzFactory implements FactoryMethod {

	@Override
	public Car createCar() {
		return new BenzCar();
	}
}
