package TestDemo;

import ThreadDemo.myThread;

public class TestDeo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myThread my1=new myThread();
		myThread my2=new myThread();
		my1.run();//������ִ�иö����run����,���Ƕ��߳�
		my1.start();//����һ���߳�,��JVMȥִ��run����,һ���̶߳���ֻ��startһ��
		my2.start();
	}

}
