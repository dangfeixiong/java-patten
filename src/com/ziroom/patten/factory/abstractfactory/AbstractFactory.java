package com.ziroom.patten.factory.abstractfactory;

import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName AbstractFactory 
 * @Description ���󹤳�(����һ�����/��������)
 * @author dfx
 * @date 2017��12��18�� ����8:54:59
 */
public interface AbstractFactory {
	//������
	Engine engine();
	//Wheel
	Wheel wheel();
}