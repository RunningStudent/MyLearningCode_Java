package login_Register.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import login_Register.dao.UserDao;
import login_Register.dao.impl.UserDaoImpl;
import login_Register.pojo.User;

public class Testemo {

	
	

	public static void main(String[] args) {
		// 为了能够回来
		while (true) {
			List<String> list=new ArrayList<String>();
			list.add("123");
			//String tempString=list[0];
			
			
			// 欢迎界面，给出选择项
			System.out.println("--------------欢迎光临--------------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.println("请输入你的选择:");
			// 键盘录入选择，根据选择做不同的操作
			Scanner sc = new Scanner(System.in);
			// 为了后面的录入信息的方便，我所有的数据录入全部用字符接收
			String choiceString = sc.nextLine();

			// switch语句的多个地方要使用，我就定义到外面
			UserDao ud = new UserDaoImpl();

			// 经过简单的思考，我选择了switch
			switch (choiceString) {
			case "1":
				// 登录界面，请输入用户名和密码
				System.out.println("--------------登录界面--------------");
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入密码：");
				String password = sc.nextLine();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功");
				} else {
					System.out.println("用户名或者密码有误,登录失败");
				}
				break;
			case "2":
				// 欢迎界面，请输入用户名和密码
				System.out.println("--------------注册界面--------------");
				System.out.println("请输入用户名：");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码：");
				String newPassword = sc.nextLine();

				// 把用户名和密码封装到一个对象中
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				
				ud.register(user);
				System.out.println("注册成功");
				break;
			case "3":
			default:
				System.out.println("谢谢使用，欢迎下次再来");
				System.exit(0);
				break;
				
			}
		}
	}

}
