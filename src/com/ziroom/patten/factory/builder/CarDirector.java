package com.ziroom.patten.factory.builder;

import com.ziroom.patten.factory.bean.Product;

/**
 * 
 * @ClassName CarDirector 
 * @Description 组装
 * @author dfx
 * @date 2017年12月20日 上午10:06:26
 */
public interface CarDirector {
	//组装汽车产品
	Product carDirector();
}
