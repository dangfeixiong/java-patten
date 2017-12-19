package com.ziroom.patten.factory.factorymethod;

import com.ziroom.patten.factory.bean.BYDCar;
import com.ziroom.patten.factory.bean.Car;

/**
 * 
 * @ClassName BYDFactory 
 * @Description 制造比亚迪汽车的工厂
 * @author dfx
 * @date 2017年12月18日 下午12:04:05
 */
public class BYDFactory implements FactoryMethod {

	@Override
	public Car createCar() {
		return new BYDCar();
	}

}
