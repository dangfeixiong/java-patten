package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BenzCar 
 * @Description ��������
 * @author dfx
 * @date 2017��12��18�� ����11:14:39
 */
public class BenzCar implements Car {

	@Override
	public String start() {
		return "��������==>start";
	}

	@Override
	public String run() {
		return "��������==>run";
	}

	@Override
	public String stop() {
		return "��������==>stop";
	}

}
