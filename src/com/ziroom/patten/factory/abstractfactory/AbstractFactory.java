package com.ziroom.patten.factory.abstractfactory;

import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName AbstractFactory 
 * @Description 抽象工厂(创建一组相关/依赖对象)
 * @author dfx
 * @date 2017年12月18日 下午8:54:59
 */
public interface AbstractFactory {
	//发动机
	Engine engine();
	//Wheel
	Wheel wheel();
}