package com.ziroom.patten.bridge;

public interface Brand {
	//品牌
	String brand();
}

//联想
class Lenovo implements Brand {

	@Override
	public String brand() {
		return "联想";
	}
}

//戴尔
class Dell implements Brand {

	@Override
	public String brand() {
		return "戴尔";
	}
}