package com.ziroom.patten.builder;

import org.junit.Test;

import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;

/**
 * 
 * @ClassName Client 
 * @Description ������ģʽ����
 * @author dfx
 * @date 2017��12��20�� ����12:00:12
 */
public class Client {
	
	@Test
	public void test(){
		CarDirector carDirector = new BYDCarDirector(new BYDCarBuilder(new BYDAbstractFactory()));
		carDirector.carDirector();
	}
}
