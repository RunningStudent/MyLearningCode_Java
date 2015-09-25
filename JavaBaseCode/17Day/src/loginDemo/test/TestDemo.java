package loginDemo.test;

import java.util.Scanner;

import loginDemo.dao.impl.UserLoginImpl;
import loginDemo.pojo.User;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLoginImpl uLoginImpl = new UserLoginImpl();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("=======欢迎===========");
			System.out.println("1.注册");
			System.out.println("2.登入");
			System.out.println("3.退出");
			String choose = scanner.nextLine();

			switch (choose) {
			case "1":
				User u = new User();
				System.out.println("输入用户名");
				u.setUserName(scanner.nextLine());
				System.out.println("输入密码");
				u.setPassWord(scanner.nextLine());
				uLoginImpl.register(u);
				System.out.println("注册成功1");
				break;
			case "2":
				System.out.println("输入用户名");
				String userName = scanner.nextLine();
				System.out.println("输入密码");
				String passWord = scanner.nextLine();
				if (!uLoginImpl.login(userName, passWord)) {
					System.out.println("用户名密码错误");
				} else {
					System.out.println("登入成功");
				}
				break;
			case "3":
				System.out.println("欢迎下次再来");
				System.exit(0);
				break;
			default:
				break;
			}
			

		}
	}

}
