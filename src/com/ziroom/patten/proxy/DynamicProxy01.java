package com.ziroom.patten.proxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * 
 * @ClassName: DynamicProxy01.java
 * @Description: 模拟java自己实现的动态代理01(生成.java文件==>compile==>load money==>newInstance)
 * @author: dfx
 * @date: 2018年1月7日 上午12:25:10
 */
public class DynamicProxy01 {
	// 产生代理类的method
	public static Object newProxyInstance() throws Exception {
		// 回车换行
		String rt = "\r\n";
		// java类
		String str = 
				"package com.ziroom.patten.proxy;" + rt +
				"public class DynamicProxy implements Movable {" + rt +
				"	private Movable tank;" + rt +
				"	public DynamicProxy(Movable tank) {" + rt +
				"		this.tank = tank;" + rt +
				"	}" + rt +
				"	@Override" + rt +
				"	public void move() {" + rt +
				"		Long start = System.currentTimeMillis();" + rt +
				"		tank.move();" + rt +
				"		Long end = System.currentTimeMillis();" + rt +
				"		System.out.println(\"method执行时间为:\" + (end - start));" + rt +
				"	}" + rt +
				"}";
		
		// 将字符串写到文件中
		String fileName ="D:/src/com/ziroom/patten/proxy/DynamicProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(str);
		fw.flush();
		fw.close();
		
		// compile(根据.java文件生成.class文件)
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
		Constructor ctr = c.getConstructor(Movable.class);
		Movable m = (Movable)ctr.newInstance(new Tank());
		return m;
	}
}
