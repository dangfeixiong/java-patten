package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BYDCar 
 * @Description 比亚迪汽车
 * @author dfx
 * @date 2017年12月18日 上午11:16:34
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
