package com.ziroom.patten.adapter;

/**
 * 
 * @ClassName Adapter 
 * @Description 适配器类
 * @author dfx
 * @date 2017年12月25日 上午10:00:09
 */
public class Adapter implements Target {
	
	//======================//
	//		1.对象适配			//
	//======================//

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public String threePlug() {
		return adaptee.plug();
	}
	
	//======================//
	//		1.类适配			//
	//======================//
	
	/*
	@Override
	public String transform() {
		return super.USBPlug();
	}
	*/

}
