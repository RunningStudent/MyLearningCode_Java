package SimulateLogin;

import java.util.Scanner;





public class GuessNumber {
	/**
	 * ���಻��ʵ����
	 */
	private  GuessNumber(){}
	
	public static void Star(){
		int number=(int)Math.random()*100+1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("��һ��1~100������");
		
		while (true) {
			int userInput=scanner.nextInt();
			if (userInput>number) {
				System.out.println("�´���");
			} else if (userInput<number) {
				System.out.println("��С��");
				
			} else{
				System.out.println("�¶���");
				break;
			}
		}
	}
	
}
