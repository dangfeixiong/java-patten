package com.ziroom.patten.factory.builder;

import com.ziroom.patten.factory.bean.Product;

/**
 * 
 * @ClassName BYDCarDirector 
 * @Description 组装比亚迪
 * @author dfx
 * @date 2017年12月20日 上午11:14:02
 */
public class BYDCarDirector implements CarDirector {
	
	private CarBuilder carBuilder;

	public BYDCarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	@Override
	public Product carDirector() {
		Product product = new Product();
		product.setEngine(carBuilder.builderEngine());
		product.setWheel(carBuilder.builderWheel());
		return product;
	}
}
