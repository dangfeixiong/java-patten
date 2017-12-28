package com.ziroom.patten.bridge;

/**
 * 
 * @ClassName Computer02 
 * @Description ʹ���Ž�ģʽ
 * @author dfx
 * @date 2017��12��25�� ����11:34:34
 */
public abstract class Computer02 {
	
	protected Brand brand;
	
	public Computer02(Brand brand) {
		this.brand = brand;
	}

	public abstract String salary();
}

//�������
class DeskComputer02 extends Computer02 {
	
	public DeskComputer02(Brand brand) {
		super(brand);
	}

	@Override
	public String salary() {
		// ��ż۸�
		return super.brand.brand() + ":" + "4000~6000";
	}
}

//�ʼǱ�
class LaptopComputer02 extends Computer02 {

	public LaptopComputer02(Brand brand) {
		super(brand);
	}

	@Override
	public String salary() {
		// ��ż۸�
		return super.brand.brand() + ":" + "5000~7000";
	}
}

//pad
class PadComputer02 extends Computer02 {

	public PadComputer02(Brand brand) {
		super(brand);
	}

	@Override
	public String salary() {
		// ��ż۸�
		return super.brand.brand() + ":" + "2000~4000";
	}
}
