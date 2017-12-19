package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BenzEngine 
 * @Description 奔驰车的发动机
 * @author dfx
 * @date 2017年12月19日 上午9:45:45
 */
public class BenzEngine implements Engine {

	@Override
	public String show() {
		return "BenzEngine";
	}

}
