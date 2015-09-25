package loginDemo.dao.impl;



import java.util.ArrayList;

import loginDemo.dao.userLogin;
import loginDemo.pojo.User;

public class UserLoginImpl implements userLogin {

	private ArrayList<User> userMessage=new ArrayList<User>();
	
	
	@Override
	public boolean login(String userName, String passWord) {
		for (User u : userMessage) {
			if(u.getUserName().equals(userName)&&u.getPassWord().equals(passWord)){
				return true;
			}
		}
		return false;
	}

	@Override
	public void register(User user) {
		userMessage.add(user);
	}

}
