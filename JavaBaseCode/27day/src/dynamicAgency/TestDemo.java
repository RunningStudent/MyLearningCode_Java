package dynamicAgency;

import java.lang.reflect.Proxy;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//实例化对象
		TestInterFace ti = new TestInterFaceimp();
		//实例化Handler对象
		MyInvocationHandler mihHandler=new MyInvocationHandler(ti);
		//获得代理对象
		TestInterFace tempFace=(TestInterFace)Proxy.newProxyInstance(ti.getClass().getClassLoader(), ti.getClass().getInterfaces(),mihHandler);
		//调用方法
		tempFace.Method1();
		tempFace.Method2();
	}

}
