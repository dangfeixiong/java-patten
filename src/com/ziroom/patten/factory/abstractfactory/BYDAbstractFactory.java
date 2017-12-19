package com.ziroom.patten.factory.abstractfactory;

import com.ziroom.patten.factory.bean.BYDEngine;
import com.ziroom.patten.factory.bean.BYDWheel;
import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName BYDFactory 
 * @Description BYD工厂
 * @author dfx
 * @date 2017年12月18日 下午9:12:16
 */
public class BYDAbstractFactory implements AbstractFactory {

	@Override
	public Engine engine() {
		return new BYDEngine();
	}

	@Override
	public Wheel wheel() {
		return new BYDWheel();
	}

}
