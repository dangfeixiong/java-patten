package com.ziroom.patten.factory.bean;

/**
 * 
 * @ClassName BYDEngine 
 * @Description 比亚迪汽车的发动机 
 * @author dfx
 * @date 2017年12月19日 上午9:44:43
 */
public class BYDEngine implements Engine {

	@Override
	public String show() {
		return "BYDEngine";
	}

}
