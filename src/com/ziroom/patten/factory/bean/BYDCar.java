package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BYDCar 
 * @Description ���ǵ�����
 * @author dfx
 * @date 2017��12��18�� ����11:16:34
 */
public class BYDCar implements Car {

	@Override
	public Engine engine() {
		System.out.println("BYDEngine");
		return new BYDEngine();
	}

	@Override
	public Wheel wheel() {
		System.out.println("BYDWheel");
		return new BYDWheel();
	}

}
