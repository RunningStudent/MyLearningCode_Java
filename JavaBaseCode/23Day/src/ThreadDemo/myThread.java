package ThreadDemo;

public class myThread extends Thread {
	@Override
	public void run() {
		//��Ҫִ���ڶ��̵߳ķ���
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
