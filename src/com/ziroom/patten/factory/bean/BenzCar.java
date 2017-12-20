package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BenzCar 
 * @Description 奔驰汽车
 * @author dfx
 * @date 2017年12月18日 上午11:14:39
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
