package login_Register.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import login_Register.dao.UserDao;
import login_Register.pojo.User;

public class UserDaoImpl implements UserDao {

	private static File file=new File("UserInfo.txt");
	/**
	 * ʹ�þ�̬����鴴��UserInfo�ļ�
	 */
	static{
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��");
		}
	}
	
	@Override
	public boolean isLogin(String username, String password) {
		BufferedReader reader=null;
		String line=null;
		boolean isLogin=false;
		try {
			reader=new BufferedReader(new FileReader(file));
			while((line=reader.readLine())!=null){
				String[] strs=line.split("=");
				if (username.equals(strs[0])&&password.equals(strs[1])) {
					isLogin=true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}catch (IOException e) {
			System.out.println("����ʧ��");
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("�ͷ���Դʧ��");
			}
		}
		return isLogin;
	}

	@Override
	public void register(User user) {
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter(file,true));
			writer.write(user.getUsername()+"="+user.getPassword());
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			System.out.println("ע��ʧ��");
		}finally{
			if (writer!=null) {
				try {
					writer.close();
				} catch (IOException e1) {
					System.out.println("��Դ�ͷ�ʧ��");
				}
			}
		}
		
	}

}
