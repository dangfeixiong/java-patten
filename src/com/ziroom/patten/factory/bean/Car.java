package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName Car 
 * @Description 简单工厂模式中的实体
 * @author dfx
 * @date 2017年12月18日 上午11:06:53
 */
public interface Car {
	//start
	String start();
	//run
	String run();
	//stop
	String stop();
}