package com.ziroom.patten.decorator;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description ����(GOF)���ģʽ--װ����ģʽ
 * @author dfx
 * @date 2017��12��28�� ����10:11:41
 */
public class Client {

	@Test
	public void move(){
		//��������
		ICar car1 = new Car();
		car1.move();
		
		//��չ����
		ICar car2 = new FlyCar(car1);
		car2.move();
		
		//��չ��������չ����
		ICar car3 = new WaterCar(car2);
		car3.move();
	}
}
