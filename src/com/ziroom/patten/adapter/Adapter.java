package com.ziroom.patten.adapter;

/**
 * 
 * @ClassName Adapter 
 * @Description ��������
 * @author dfx
 * @date 2017��12��25�� ����10:00:09
 */
public class Adapter implements Target {
	
	//======================//
	//		1.��������			//
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
	//		1.������			//
	//======================//
	
	/*
	@Override
	public String transform() {
		return super.USBPlug();
	}
	*/

}
