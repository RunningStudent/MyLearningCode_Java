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
			System.out.println("=======��ӭ===========");
			System.out.println("1.ע��");
			System.out.println("2.����");
			System.out.println("3.�˳�");
			String choose = scanner.nextLine();

			switch (choose) {
			case "1":
				User u = new User();
				System.out.println("�����û���");
				u.setUserName(scanner.nextLine());
				System.out.println("��������");
				u.setPassWord(scanner.nextLine());
				uLoginImpl.register(u);
				System.out.println("ע��ɹ�1");
				break;
			case "2":
				System.out.println("�����û���");
				String userName = scanner.nextLine();
				System.out.println("��������");
				String passWord = scanner.nextLine();
				if (!uLoginImpl.login(userName, passWord)) {
					System.out.println("�û����������");
				} else {
					System.out.println("����ɹ�");
				}
				break;
			case "3":
				System.out.println("��ӭ�´�����");
				System.exit(0);
				break;
			default:
				break;
			}
			

		}
	}

}
