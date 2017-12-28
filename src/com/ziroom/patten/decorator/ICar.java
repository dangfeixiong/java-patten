package com.ziroom.patten.decorator;

// 抽象构件角色[Component]
public interface ICar {
	void move();
}

// 具体构件角色,真实对象[ConcreteComponent]
class Car implements ICar {
	@Override
	public void move() {
		System.out.println("小汽车在陆地上跑!");
	}
}

// 装饰抽象类,定义增强的架子[Decorator]
// 1.implements ICar 限制是对构件的增强
// 2.protected ICar iCar 扩展多种具体的构件
class SuperCar implements ICar {

	protected ICar iCar;
	
	// 有参构造
	public SuperCar(ICar iCar) {
		this.iCar = iCar;
	}

	@Override
	public void move() {
		iCar.move();
	}
}

// 具体装饰角色,完成对Component的具体增强[ConcreteDecorator]
class FlyCar extends SuperCar {

	public FlyCar(ICar iCar) {
		super(iCar);
	}
	
	// 增强方法
	public void fly(){
		System.out.println("增加在天上飞...");
	}
	
	public void move() {
		iCar.move();
		fly();
	}
}

//具体装饰角色,完成对Component的具体增强[ConcreteDecorator]
class WaterCar extends SuperCar {

	public WaterCar(ICar iCar) {
		super(iCar);
	}
	
	// 增强方法
	public void swim(){
		System.out.println("增加在水里游...");
	}
	
	public void move() {
		iCar.move();
		swim();
	}
}
