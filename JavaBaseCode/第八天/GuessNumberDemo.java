/*
	猜数字游戏(1-100)
*/
import java.util.Scanner;
class guessNumber{
	public static void main(String[] args){
		int number=(int)(Math.random()*100)+1;
		int guessNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("猜数字");
		guessNumber=sc.nextInt();
		while(true)
		{
			if(guessNumber==number){
				System.out.println("猜对了");
				break;
			}else if(guessNumber<number){
				System.out.println("猜小了");
			}else{
				System.out.println("猜大了");
			}		
			guessNumber=sc.nextInt();
		}
	}
}