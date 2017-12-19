package com.ziroom.patten.factory.simplefactory;

import com.ziroom.patten.factory.bean.BYDCar;
import com.ziroom.patten.factory.bean.BenzCar;
import com.ziroom.patten.factory.bean.Car;

/**
 * 
 * @ClassName SimpleFactory 
 * @Description �򵥹���(�򵥹�����ʼ����һ�����ģʽ,���Ƚ�����һ�ֱ��ϰ��)
 * @author dfx
 * @date 2017��12��18�� ����11:18:01
 */
public class SimpleFactory {
	
	//��������
	public Car createCar(String brandType){
		Car car = null;
		if(brandType.equals("BenzCar")){
			car = new BenzCar();
		}else if(brandType.equals("BYDCar")){
			car = new BYDCar();
		}
		return car;
	}
}
