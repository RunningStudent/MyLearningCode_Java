package login_Register.dao;

import login_Register.pojo.User;

public interface UserDao {
	
	/**
	 * �û�����
	 * @param username
	 * @param password
	 * @return �Ƿ����ɹ�
	 */
	public abstract boolean isLogin(String username,String password);
	
	
	public abstract void register(User user);
}
