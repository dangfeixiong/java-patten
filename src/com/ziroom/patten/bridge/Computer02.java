package com.ziroom.patten.bridge;

/**
 * 
 * @ClassName Computer02 
 * @Description 使用桥接模式
 * @author dfx
 * @date 2017年12月25日 上午11:34:34
 */
public abstract class Computer02 {
	
	protected Brand brand;
	
	public Computer02(Brand brand) {
		this.brand = brand;
	}

	public abstract String salary();
}

//桌面电脑
class DeskComputer02 extends Computer02 {
	
	public DeskComputer02(Brand brand) {
		super(brand);
	}

	@Override
	public String salary() {
		// 大概价格
		return super.brand.brand() + ":" + "4000~6000";
	}
}

//笔记本
class LaptopComputer02 extends Computer02 {

	public LaptopComputer02(Brand brand) {
		super(brand);
	}

	@Override
	public String salary() {
		// 大概价格
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
		// 大概价格
		return super.brand.brand() + ":" + "2000~4000";
	}
}
