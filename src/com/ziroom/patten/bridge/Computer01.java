package com.ziroom.patten.bridge;


/**
 * 
 * @ClassName Computer
 * @Description 电脑接口(分类:类型,品牌)Java继承实现
 * @author dfx
 * @date 2017年12月25日 上午11:13:58
 */
public interface Computer01 {
	// 销售价格
	String salary();
}

// 桌面电脑
class DeskComputer01 implements Computer01 {

	@Override
	public String salary() {
		// 大概价格
		return "4000~6000";
	}
}

// 笔记本
class LaptopComputer01 implements Computer01 {

	@Override
	public String salary() {
		// 大概价格
		return "5000~7000";
	}
}

// pad
class PadComputer01 implements Computer01 {

	@Override
	public String salary() {
		// 大概价格
		return "2000~4000";
	}
}

// lenovo--桌面电脑
class LenovoDeskComputer01 extends DeskComputer01 {
	@Override
	public String salary() {
		// 大概价格
		return "5000~5500";
	}
}

// lenovo--笔记本
class LenovoLaptopComputer01 extends LaptopComputer01 {
	@Override
	public String salary() {
		// 大概价格
		return "5500~6500";
	}
}

// lenovo--pad
class LenovoPadComputer01 extends PadComputer01 {
	@Override
	public String salary() {
		// 大概价格
		return "2500~3400";
	}
}

// dell--桌面电脑
class DellDeskComputer01 extends DeskComputer01 {
	@Override
	public String salary() {
		// 大概价格
		return "3000~4500";
	}
}

// dell--笔记本
class DellLaptopComputer01 extends LaptopComputer01 {
	@Override
	public String salary() {
		// 大概价格
		return "5500~5800";
	}
}

// dell--pad
class DellPadComputer01 extends PadComputer01 {
	@Override
	public String salary() {
		// 大概价格
		return "2800~3200";
	}
}