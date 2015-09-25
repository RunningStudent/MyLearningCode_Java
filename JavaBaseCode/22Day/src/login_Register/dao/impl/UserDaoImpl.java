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
	 * 使用静态代码块创建UserInfo文件
	 */
	static{
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("创建文件失败");
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
			System.out.println("文件未找到");
		}catch (IOException e) {
			System.out.println("登入失败");
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("释放资源失败");
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
			System.out.println("注册失败");
		}finally{
			if (writer!=null) {
				try {
					writer.close();
				} catch (IOException e1) {
					System.out.println("资源释放失败");
				}
			}
		}
		
	}

}
