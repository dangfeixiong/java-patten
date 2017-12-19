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
	public String start() {
		return "比亚迪汽车==>start";
	}

	@Override
	public String run() {
		return "比亚迪汽车==>run";
	}

	@Override
	public String stop() {
		return "比亚迪汽车==>stop";
	}

}
