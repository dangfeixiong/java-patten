package com.ziroom.patten.bridge;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description �Ž�ģʽ������
 * @author dfx
 * @date 2017��12��25�� ����11:13:09
 */
public class Client {
	
	/*
	 * Υ���˵�һְ��ԭ��
	 * ���̳У���ĸ�����������
	 */
	
	@Test
	public void computer01(){
		//�����ʼǱ�
		Computer01 computer01 = new DellLaptopComputer01();
		System.out.println(computer01.salary());
	}

	@Test
	public void computer02(){
		//�����ʼǱ�
		Computer02 computer02 = new LaptopComputer02(new Dell());
		System.out.println(computer02.salary());
	}
}
