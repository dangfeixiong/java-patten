package com.ziroom.patten.adapter;

/**
 * 
 * @ClassName Adaptee 
 * @Description 被适配类 
 * @author dfx
 * @date 2017年12月25日 上午10:01:01
 */
public class USBAdaptee implements Adaptee{

	@Override
	public String plug() {
		return "USB插孔";
	}

}
