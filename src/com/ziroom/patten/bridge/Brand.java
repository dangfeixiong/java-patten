package com.ziroom.patten.bridge;

public interface Brand {
	//Ʒ��
	String brand();
}

//����
class Lenovo implements Brand {

	@Override
	public String brand() {
		return "����";
	}
}

//����
class Dell implements Brand {

	@Override
	public String brand() {
		return "����";
	}
}