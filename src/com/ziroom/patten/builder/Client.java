package com.ziroom.patten.builder;

import org.junit.Test;

import com.ziroom.patten.factory.abstractfactory.BYDAbstractFactory;

/**
 * 
 * @ClassName Client 
 * @Description 建造者模式测试
 * @author dfx
 * @date 2017年12月20日 下午12:00:12
 */
public class Client {
	
	@Test
	public void test(){
		CarDirector carDirector = new BYDCarDirector(new BYDCarBuilder(new BYDAbstractFactory()));
		carDirector.carDirector();
	}
}
