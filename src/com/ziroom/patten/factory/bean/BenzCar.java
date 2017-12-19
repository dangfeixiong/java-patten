package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BenzCar 
 * @Description ±¼³ÛÆû³µ
 * @author dfx
 * @date 2017Äê12ÔÂ18ÈÕ ÉÏÎç11:14:39
 */
public class BenzCar implements Car {

	@Override
	public String start() {
		return "±¼³ÛÆû³µ==>start";
	}

	@Override
	public String run() {
		return "±¼³ÛÆû³µ==>run";
	}

	@Override
	public String stop() {
		return "±¼³ÛÆû³µ==>stop";
	}

}
