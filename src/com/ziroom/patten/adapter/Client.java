package com.ziroom.patten.adapter;

import org.junit.Test;

/**
 * 
 * @ClassName Client 
 * @Description ����(GOF)���ģʽ--������ģʽ
 * @author dfx
 * @date 2017��12��25�� ����9:57:15
 */
public class Client {
	
	/*
	 * 	����:��һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿ�(��������û�б仯,ֻ��ʵ���б仯)
	 * 	1.Ŀ��ӿڣ�Target�����ͻ����ڴ��Ľӿڡ�
	 * 	2.��Ҫ������ࣨAdaptee������Ҫ���������������ࡣ
	 * 	3.��������Adapter����ͨ����װһ����Ҫ����Ķ��󣬰�ԭ�ӿ�ת����Ŀ��ӿڡ�����
	 */
	
	@Test
	public void threePlug(){
		//USBת��ͷ
		//Adaptee adaptee = new USBAdaptee();
		//2�ײ�ͷת��ͷ
		Adaptee adaptee = new TwoAdaptee();
		Target target = new Adapter(adaptee);
		System.out.println(target.threePlug());
	}
}
