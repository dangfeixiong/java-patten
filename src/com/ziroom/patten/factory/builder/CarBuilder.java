package com.ziroom.patten.factory.builder;

import com.ziroom.patten.factory.bean.Engine;
import com.ziroom.patten.factory.bean.Wheel;

/**
 * 
 * @ClassName CarBuilder 
 * @Description ����
 * @author dfx
 * @date 2017��12��20�� ����9:52:33
 */
public interface CarBuilder {
	//����������
	Engine builderEngine();
	//��������
	Wheel builderWheel();

}
