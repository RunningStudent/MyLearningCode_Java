/*
	��������Ϸ(1-100)
*/
import java.util.Scanner;
class guessNumber{
	public static void main(String[] args){
		int number=(int)(Math.random()*100)+1;
		int guessNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("������");
		guessNumber=sc.nextInt();
		while(true)
		{
			if(guessNumber==number){
				System.out.println("�¶���");
				break;
			}else if(guessNumber<number){
				System.out.println("��С��");
			}else{
				System.out.println("�´���");
			}		
			guessNumber=sc.nextInt();
		}
	}
}