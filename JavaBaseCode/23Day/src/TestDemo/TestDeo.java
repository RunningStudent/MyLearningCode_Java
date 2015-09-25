package TestDemo;

import ThreadDemo.myThread;

public class TestDeo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myThread my1=new myThread();
		myThread my2=new myThread();
		my1.run();//仅仅是执行该对象的run方法,并非多线程
		my1.start();//启动一个线程,让JVM去执行run方法,一个线程对象只能start一次
		my2.start();
	}

}
