package loginDemo.dao;
import loginDemo.pojo.User;



/**
 * �û�����ӿ�
 * @author Recod_000
 * @version 1.0v
 */
public interface userLogin {
	/**
	 * �û�����
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public abstract boolean login(String userName,String passWord);
	
	/**
	 * �û�ע��
	 * @param user
	 */
	public abstract void register(User user);
}
