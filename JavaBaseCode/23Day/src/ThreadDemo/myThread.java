package ThreadDemo;

public class myThread extends Thread {
	@Override
	public void run() {
		//需要执行在多线程的方法
		for(int i=0;i<200;i++){
			System.out.println(i);
		}
	}

	public myThread() {
		super();
	}
	
	public myThread(String name) {
		super(name);
	}
	
	
}
