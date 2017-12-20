package com.ziroom.patten.builder;

import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;
import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName BYDCarBuilder
 * @Description �������ǵ����
 * @author dfx
 * @date 2017��12��20�� ����10:01:04
 */
public class BYDCarBuilder implements CarBuilder {

	//��Ʒ����
	private BYDAbstractFactory bydAbstractFactory;
	
	public BYDCarBuilder(BYDAbstractFactory bydAbstractFactory) {
		this.bydAbstractFactory = bydAbstractFactory;
	}

	@Override
	public Engine builderEngine() {
		// ����ʹ�ù�������������Ĳ�Ʒ
		return bydAbstractFactory.engine();
		// return new BYDEngine();
	}

	@Override
	public Wheel builderWheel() {
		return bydAbstractFactory.wheel();
		// return new BYDWheel();
	}
}
