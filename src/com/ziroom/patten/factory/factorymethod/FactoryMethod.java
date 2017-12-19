package com.ziroom.patten.factory.factorymethod;

import com.ziroom.patten.factory.bean.Car;

/**
 * 
 * @ClassName FactoryMethod 
 * @Description 工厂方法(解决了简单工厂的开闭原则[对于扩展是开放的，对于修改是关闭])
 * @author dfx
 * @date 2017年12月18日 下午12:01:02
 */
public interface FactoryMethod {
	//生产汽车
	public Car createCar();
}
