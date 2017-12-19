package com.ziroom.patten.factory.factorymethod;

import com.ziroom.patten.factory.bean.BenzCar;
import com.ziroom.patten.factory.bean.Car;

/**
 * 
 * @ClassName BenzFactory 
 * @Description ���챼�������Ĺ��� 
 * @author dfx
 * @date 2017��12��18�� ����12:02:45
 */
public class BenzFactory implements FactoryMethod {

	@Override
	public Car createCar() {
		return new BenzCar();
	}
}
