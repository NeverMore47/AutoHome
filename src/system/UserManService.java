package system;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;
import entity.Role;
import entity.User;
import entity.UserInfo;

public class UserManService {

	private DBOperational db = new DBOperational();

	// 作用于用户管理的用户信息
	public List selectUser(int sPage,int pSize) {
		String sql = "SELECT uID,uName,rName,pName FROM users u,roles r,permissions p WHERE u.rID = r.rID AND r.pID = p.pID limit "+sPage*pSize+","+pSize;
		List list = db.selectAll(sql, UserInfo.class);
		return list;
	}
	public int selectUser() {
		String sql = "SELECT count(*) FROM users u,roles r,permissions p WHERE u.rID = r.rID AND r.pID = p.pID";
		return db.selectAll(sql);
	}
	// 作用于修改用户信息的userInfo
	public User selectInfo(String uName) {
		String sql = "SELECT uName,uPwd,rID FROM users WHERE uName = '" + uName
				+ "'";
		List list = db.selectAll(sql, User.class);
		User user = (User) list.get(0);

		return user;
	}

	// 作用于修改用户信息的所有角色名称
	public List selectRoles() {
		String sql = "SELECT rID,rName FROM roles";
		List list = db.selectAll(sql, Role.class);

		return list;
	}

	// 修改用户密码及角色
	public int updateUser(User u) {
		String sql = "UPDATE users SET uPwd = {uPwd},rID = {rID} WHERE uName = '{uName}'";
		sql = SQLFilter.sqlFilter(sql, u);

		int flag = db.update(sql);
		return flag;
	}

	// 删除用户方法
	public int deleteUser(Integer uID) {
		String sql = "DELETE FROM users WHERE uID = " + uID;
		int flag = db.update(sql);
		return flag;
	}

	// 添加用户方法
	public void addUser(User user) {
		String sql = "INSERT INTO users (uName,uPwd,rID) VALUES ('{uName}',{uPwd},{rID})";
		sql = SQLFilter.sqlFilter(sql, user);
		db.update(sql);
	}

	// 查看用户具体信息
	public List viewUser(Integer uID) {
		String sql = "SELECT uName,uPwd,(SELECT rName FROM roles WHERE rID = (SELECT rID FROM users WHERE uID = "+ uID +")) FROM users WHERE uID = " + uID;
		List list = db.selectAll(sql, User.class);
		return list;
	}
	
	public boolean testUser(String uName) {
		String sql = "select * from users where uName = '" + uName + "'";
		List list = db.selectAll(sql, User.class);
		if(list.size() > 0) {
			return true;
		}
		return false;
	}

}
