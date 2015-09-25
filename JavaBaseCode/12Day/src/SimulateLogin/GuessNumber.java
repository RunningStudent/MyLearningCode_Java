package SimulateLogin;

import java.util.Scanner;





public class GuessNumber {
	/**
	 * 该类不可实例化
	 */
	private  GuessNumber(){}
	
	public static void Star(){
		int number=(int)Math.random()*100+1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("猜一个1~100的数字");
		
		while (true) {
			int userInput=scanner.nextInt();
			if (userInput>number) {
				System.out.println("猜大了");
			} else if (userInput<number) {
				System.out.println("猜小了");
				
			} else{
				System.out.println("猜对了");
				break;
			}
		}
	}
	
}
