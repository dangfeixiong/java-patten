package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName Product 
 * @Description 构建者产品实体
 * @author dfx
 * @date 2017年12月20日 下午12:44:29
 */
public class Product {

	private Engine engine;

	private Wheel wheel;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

}
