package user;

import java.util.List;

import dao.DBOperational;
import entity.User;

public class LoginService {

	private DBOperational db = new DBOperational();

	// 登录验证方法
	public User testLogin(User user) {
		String sql = "SELECT uName,uPwd,rID FROM users where uName='"
				+ user.getuName() + "' and uPwd='" + user.getuPwd() + "'";
		List list = db.selectAll(sql, User.class);

		if (list.size() > 0) {
			return (User) list.get(0);
		}
		return null;
	}
}
