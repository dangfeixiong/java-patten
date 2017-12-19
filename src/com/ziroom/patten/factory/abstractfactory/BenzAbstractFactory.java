package com.ziroom.patten.factory.abstractfactory;

import com.ziroom.patten.factory.bean.BenzEngine;
import com.ziroom.patten.factory.bean.BenzWheel;
import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName BenzFactory 
 * @Description 奔驰工厂
 * @author dfx
 * @date 2017年12月18日 下午9:11:57
 */
public class BenzAbstractFactory implements AbstractFactory {

	@Override
	public Engine engine() {
		return new BenzEngine();
	}

	@Override
	public Wheel wheel() {
		return new BenzWheel();
	}

}
