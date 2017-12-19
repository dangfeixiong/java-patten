package com.ziroom.patten.factory.factorymethod;

import com.ziroom.patten.factory.bean.BYDCar;
import com.ziroom.patten.factory.bean.Car;

/**
 * 
 * @ClassName BYDFactory 
 * @Description ������ǵ������Ĺ���
 * @author dfx
 * @date 2017��12��18�� ����12:04:05
 */
public class BYDFactory implements FactoryMethod {

	@Override
	public Car createCar() {
		return new BYDCar();
	}

}
