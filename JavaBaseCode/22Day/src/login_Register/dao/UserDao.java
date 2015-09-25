package login_Register.dao;

import login_Register.pojo.User;

public interface UserDao {
	
	/**
	 * 用户登入
	 * @param username
	 * @param password
	 * @return 是否登入成功
	 */
	public abstract boolean isLogin(String username,String password);
	
	
	public abstract void register(User user);
}
