package com.ziroom.patten.proxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * 
 * @ClassName: DynamicProxy02.java
 * @Description: 模拟java自己实现的动态代理02 (实现任意接口的代理)
 * @author: dfx
 * @date: 2018年1月7日 上午12:25:10
 */
public class DynamicProxy02 {
	// 产生代理类的method
	public static Object newProxyInstance(Class inface) throws Exception {
		// 回车换行
		String rt = "\r\n";
		
		// 生成method
		String methodStr = "";
		Method[] methods = inface.getMethods();
		for(Method m : methods) {
			methodStr += "@Override" + rt +
						 "public void " + m.getName() + "() {" + rt +
						 "	Long start = System.currentTimeMillis();" + rt +
						 "	tank." + m.getName() + "();" + rt +
						 "	Long end = System.currentTimeMillis();" + rt +
						 "	System.out.println(\"method执行时间为:\" + (end - start));" + rt +
						 "	}";
		}
		
		// java类
		String str = 
				"package com.ziroom.patten.proxy;" + rt +
				"public class DynamicProxy implements " + inface.getName() + " {" + rt +
				"	private " + inface.getName() + " tank;" + rt +
				"	public DynamicProxy(" + inface.getName() + " tank) {" + rt +
				"		this.tank = tank;" + rt +
				"	}" + rt + 
				methodStr +
				"}";
		
		// 将字符串写到文件中
		String fileName ="D:/src/com/ziroom/patten/proxy/DynamicProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(str);
		fw.flush();
		fw.close();
		
		//compile(根据.java文件生成.class文件)
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
		
		// load into memory and create an instance
		URL[] urls = new URL[] {new URL("file:/" + "D:/src/")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.ziroom.patten.proxy.DynamicProxy");
		System.out.println(c);
		
		// 带参的构造方法
		Constructor ctr = c.getConstructor(inface);
		Object m = ctr.newInstance(new Tank());
		//Object m = ctr.newInstance(new Tank01());
		return m;
	}
}
