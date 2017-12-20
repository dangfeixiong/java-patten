package com.ziroom.patten.factory.builder;

import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName CarBuilder 
 * @Description 构建
 * @author dfx
 * @date 2017年12月20日 上午9:52:33
 */
public interface CarBuilder {
	//构建发动机
	Engine builderEngine();
	//构建轮子
	Wheel builderWheel();

}
