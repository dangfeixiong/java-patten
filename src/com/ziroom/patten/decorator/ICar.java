package com.ziroom.patten.decorator;

// ���󹹼���ɫ[Component]
public interface ICar {
	void move();
}

// ���幹����ɫ,��ʵ����[ConcreteComponent]
class Car implements ICar {
	@Override
	public void move() {
		System.out.println("С������½������!");
	}
}

// װ�γ�����,������ǿ�ļ���[Decorator]
// 1.implements ICar �����ǶԹ�������ǿ
// 2.protected ICar iCar ��չ���־���Ĺ���
class SuperCar implements ICar {

	protected ICar iCar;
	
	// �вι���
	public SuperCar(ICar iCar) {
		this.iCar = iCar;
	}

	@Override
	public void move() {
		iCar.move();
	}
}

// ����װ�ν�ɫ,��ɶ�Component�ľ�����ǿ[ConcreteDecorator]
class FlyCar extends SuperCar {

	public FlyCar(ICar iCar) {
		super(iCar);
	}
	
	// ��ǿ����
	public void fly(){
		System.out.println("���������Ϸ�...");
	}
	
	public void move() {
		iCar.move();
		fly();
	}
}

//����װ�ν�ɫ,��ɶ�Component�ľ�����ǿ[ConcreteDecorator]
class WaterCar extends SuperCar {

	public WaterCar(ICar iCar) {
		super(iCar);
	}
	
	// ��ǿ����
	public void swim(){
		System.out.println("������ˮ����...");
	}
	
	public void move() {
		iCar.move();
		swim();
	}
}
