package com.ziroom.patten.builder;

import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;
import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName BYDCarBuilder
 * @Description 构建比亚迪组件
 * @author dfx
 * @date 2017年12月20日 上午10:01:04
 */
public class BYDCarBuilder implements CarBuilder {

	//产品工厂
	private BYDAbstractFactory bydAbstractFactory;
	
	public BYDCarBuilder(BYDAbstractFactory bydAbstractFactory) {
		this.bydAbstractFactory = bydAbstractFactory;
	}

	@Override
	public Engine builderEngine() {
		// 可以使用工厂来生产具体的产品
		return bydAbstractFactory.engine();
		// return new BYDEngine();
	}

	@Override
	public Wheel builderWheel() {
		return bydAbstractFactory.wheel();
		// return new BYDWheel();
	}
}
