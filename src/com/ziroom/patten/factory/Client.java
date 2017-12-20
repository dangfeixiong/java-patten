package com.ziroom.patten.factory;

import org.junit.Test;

import com.ziroom.patten.factory.abstractfactory.AbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;
import com.ziroom.patten.factory.abstractfactory.BenzAbstractFactory;
import com.ziroom.patten.factory.bean.BenzCar;
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
		factory.createCar("BenzCar");	//����
		factory.createCar("BYDCar");	//BYD
	}
	
	//��������
	@Test
	public void factoryMethord(){
		//��ȡ��������
		FactoryMethod benzFactory = new BenzFactory();
		benzFactory.createCar();
		
		//��ȡ���ǵ�����
		FactoryMethod bydFactory = new BYDFactory();
		bydFactory.createCar();
	}
	
	//���󹤳�
	@Test
	public void abstractFactory(){
		//��ȡ��������
		AbstractFactory benzFactory = new BenzAbstractFactory();
		benzFactory.engine();
		benzFactory.wheel();
		
		//��ȡ���ǵ�����
		AbstractFactory bydFactory = new BYDAbstractFactory();
		bydFactory.engine();
		bydFactory.wheel();
	}
	
}
