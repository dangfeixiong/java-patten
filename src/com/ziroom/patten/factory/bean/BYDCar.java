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
	public String start() {
		return "���ǵ�����==>start";
	}

	@Override
	public String run() {
		return "���ǵ�����==>run";
	}

	@Override
	public String stop() {
		return "���ǵ�����==>stop";
	}

}
