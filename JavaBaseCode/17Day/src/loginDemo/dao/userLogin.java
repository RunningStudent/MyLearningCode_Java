package loginDemo.dao;
import loginDemo.pojo.User;



/**
 * 用户登入接口
 * @author Recod_000
 * @version 1.0v
 */
public interface userLogin {
	/**
	 * 用户登入
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public abstract boolean login(String userName,String passWord);
	
	/**
	 * 用户注册
	 * @param user
	 */
	public abstract void register(User user);
}
