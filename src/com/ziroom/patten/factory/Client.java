package com.ziroom.patten.factory;

import org.junit.Test;

import com.ziroom.patten.factory.abstractfactory.AbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BenzAbstractFactory;
import com.ziroom.patten.factory.bean.Car;
import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;
import com.ziroom.patten.factory.factorymethod.BYDFactory;
import com.ziroom.patten.factory.factorymethod.BenzFactory;
import com.ziroom.patten.factory.factorymethod.FactoryMethod;
import com.ziroom.patten.factory.simplefactory.SimpleFactory;

/**
 * 
 * @ClassName Client 
 * @Description ����ר����
 * @author dfx
 * @date 2017��12��18�� ����11:23:50
 */
public class Client {
	
	//�򵥹���
	@Test
	public void simpleFactory(){
		//1.��ȡ����
		SimpleFactory factory = new SimpleFactory();
		//2.��ȡ����
		Car benzCar = factory.createCar("BenzCar");	//����
		Client.print(benzCar);
		Car BYDCar = factory.createCar("BYDCar");	//BYD
		Client.print(BYDCar);
	}
	
	//��������
	@Test
	public void factoryMethord(){
		//��ȡ��������
		FactoryMethod benzFactory = new BenzFactory();
		Car benzCar = benzFactory.createCar();
		Client.print(benzCar);
		
		//��ȡ���ǵ�����
		FactoryMethod bydFactory = new BYDFactory();
		Car BYDCar = bydFactory.createCar();
		Client.print(BYDCar);
	}
	
	//���󹤳�
	@Test
	public void abstractFactory(){
		//��ȡ��������
		AbstractFactory benzFactory = new BenzAbstractFactory();
		Engine benzEngine = benzFactory.engine();
		Wheel benzWheel = benzFactory.wheel();
		System.out.println("Engine:" + benzEngine.show());
		System.out.println("Wheel:" + benzWheel.show());
		
		//��ȡ���ǵ�����
		AbstractFactory bydFactory = new BYDAbstractFactory();
		Engine bydEngine = bydFactory.engine();
		Wheel bydWheel = bydFactory.wheel();
		System.out.println("Engine:" + bydEngine.show());
		System.out.println("Wheel:" + bydWheel.show());
	}
	
	
	//��װ��ӡ����
	private static void print(Car car){
		System.out.println("start:" + car.start());
		System.out.println("run:" + car.run());
		System.out.println("stop:" + car.stop());
	}

}
