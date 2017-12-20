package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BenzCar 
 * @Description ��������
 * @author dfx
 * @date 2017��12��18�� ����11:14:39
 */
public class BenzCar implements Car {

	@Override
	public Engine engine() {
		System.out.println("BenzEngine");
		return new BenzEngine();
	}

	@Override
	public Wheel wheel() {
		System.out.println("BenzWheel");
		return new BenzWheel();
	}

}
