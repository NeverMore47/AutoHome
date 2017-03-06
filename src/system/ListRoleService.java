package system;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;
import entity.Permission;
import entity.Role;
import entity.RolesInfo;

public class ListRoleService {

	private DBOperational db = new DBOperational();

	public List selectRoles() {
		String sql = "SELECT rID,rName,rDesc,pName from roles r,permissions p WHERE r.pID = p.pID";
		List list = db.selectAll(sql, RolesInfo.class);
		return list;
	}

	// 查询要修改的角色
	public List selectUpdateRole(Integer rID) {
		String sql = "select * from roles where rId =" + rID;
		List list = db.selectAll(sql, Role.class);
		return list;
	}

	// 查询用于修改角色的权限
	public List selectPer() {
		String sql = "select pID,pName from permissions";
		List list = db.selectAll(sql, Permission.class);
		return list;
	}

	// 修改角色
	public void updateRole(Role role) {
		String sql = "UPDATE roles SET rName = '{rName}',rDesc = '{rDesc}',pID = {pID} WHERE rID = {rID}";
		sql = SQLFilter.sqlFilter(sql, role);
		int i = db.update(sql);
	}
	
	//删除角色
	public void deleteRole(Integer rID) {
		String sql = "delete from roles where rID = " + rID;
		db.update(sql);
	}
	
	
	
}
