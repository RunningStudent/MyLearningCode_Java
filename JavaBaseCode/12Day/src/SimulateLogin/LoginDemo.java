package SimulateLogin;

import java.util.Scanner;

/**
 * 模拟登入,循环要求使用者输入账号密码,知道输入正确才停止程序
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
			System.out.println("请输入账号密码");
			userInput=sc.nextLine();
			passInput=sc.nextLine();
			//注意要用equals
			if(userInput.equals(username)&&passInput.equals(password))
			{
				System.out.println("正确");
				GuessNumber.Star();
				break;
			}else {
				System.out.println("账号或密码错误");
			}
		}
		System.out.print("ok");
		
	}
	
}
