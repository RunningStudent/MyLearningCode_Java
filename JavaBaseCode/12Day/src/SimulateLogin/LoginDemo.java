package SimulateLogin;

import java.util.Scanner;

/**
 * ģ�����,ѭ��Ҫ��ʹ���������˺�����,֪��������ȷ��ֹͣ����
 * @author Recod_000
 *
 */
public class LoginDemo {
	
	public static void LoginStar(){
		String username="admit";
		String password="password";
		
		String userInput;
		String passInput;
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("�������˺�����");
			userInput=sc.nextLine();
			passInput=sc.nextLine();
			//ע��Ҫ��equals
			if(userInput.equals(username)&&passInput.equals(password))
			{
				System.out.println("��ȷ");
				GuessNumber.Star();
				break;
			}else {
				System.out.println("�˺Ż��������");
			}
		}
		System.out.print("ok");
		
	}
	
}
