package login_Register.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import login_Register.dao.UserDao;
import login_Register.dao.impl.UserDaoImpl;
import login_Register.pojo.User;

public class Testemo {

	
	

	public static void main(String[] args) {
		// Ϊ���ܹ�����
		while (true) {
			List<String> list=new ArrayList<String>();
			list.add("123");
			//String tempString=list[0];
			
			
			// ��ӭ���棬����ѡ����
			System.out.println("--------------��ӭ����--------------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.println("���������ѡ��:");
			// ����¼��ѡ�񣬸���ѡ������ͬ�Ĳ���
			Scanner sc = new Scanner(System.in);
			// Ϊ�˺����¼����Ϣ�ķ��㣬�����е�����¼��ȫ�����ַ�����
			String choiceString = sc.nextLine();

			// switch���Ķ���ط�Ҫʹ�ã��ҾͶ��嵽����
			UserDao ud = new UserDaoImpl();

			// �����򵥵�˼������ѡ����switch
			switch (choiceString) {
			case "1":
				// ��¼���棬�������û���������
				System.out.println("--------------��¼����--------------");
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("���������룺");
				String password = sc.nextLine();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ�");
				} else {
					System.out.println("�û���������������,��¼ʧ��");
				}
				break;
			case "2":
				// ��ӭ���棬�������û���������
				System.out.println("--------------ע�����--------------");
				System.out.println("�������û�����");
				String newUsername = sc.nextLine();
				System.out.println("���������룺");
				String newPassword = sc.nextLine();

				// ���û����������װ��һ��������
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				
				ud.register(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
			default:
				System.out.println("ллʹ�ã���ӭ�´�����");
				System.exit(0);
				break;
				
			}
		}
	}

}
