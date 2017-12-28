package com.ziroom.patten.bridge;


/**
 * 
 * @ClassName Computer
 * @Description ���Խӿ�(����:����,Ʒ��)Java�̳�ʵ��
 * @author dfx
 * @date 2017��12��25�� ����11:13:58
 */
public interface Computer01 {
	// ���ۼ۸�
	String salary();
}

// �������
class DeskComputer01 implements Computer01 {

	@Override
	public String salary() {
		// ��ż۸�
		return "4000~6000";
	}
}

// �ʼǱ�
class LaptopComputer01 implements Computer01 {

	@Override
	public String salary() {
		// ��ż۸�
		return "5000~7000";
	}
}

// pad
class PadComputer01 implements Computer01 {

	@Override
	public String salary() {
		// ��ż۸�
		return "2000~4000";
	}
}

// lenovo--�������
class LenovoDeskComputer01 extends DeskComputer01 {
	@Override
	public String salary() {
		// ��ż۸�
		return "5000~5500";
	}
}

// lenovo--�ʼǱ�
class LenovoLaptopComputer01 extends LaptopComputer01 {
	@Override
	public String salary() {
		// ��ż۸�
		return "5500~6500";
	}
}

// lenovo--pad
class LenovoPadComputer01 extends PadComputer01 {
	@Override
	public String salary() {
		// ��ż۸�
		return "2500~3400";
	}
}

// dell--�������
class DellDeskComputer01 extends DeskComputer01 {
	@Override
	public String salary() {
		// ��ż۸�
		return "3000~4500";
	}
}

// dell--�ʼǱ�
class DellLaptopComputer01 extends LaptopComputer01 {
	@Override
	public String salary() {
		// ��ż۸�
		return "5500~5800";
	}
}

// dell--pad
class DellPadComputer01 extends PadComputer01 {
	@Override
	public String salary() {
		// ��ż۸�
		return "2800~3200";
	}
}