package system;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;
import entity.Permission;

public class ListPerService {

	private DBOperational db = new DBOperational();
	
	public List selectPer() {
		String sql = "SELECT * FROM permissions";
		List list = db.selectAll(sql, Permission.class);
		return list;
	}
	
	//删除权限方法
	public void deletePer(Integer pID) {
		String sql = "delete from permissions where pID = " + pID;
		db.update(sql);
	}
	
	//用于修改权限的查询方法
	public List selectUpPer(Integer pID) {
		String sql = "select * from permissions where pID = " + pID;
		List list = db.selectAll(sql, Permission.class);
		return list;
	}
	
	//修改权限方法
	public void updatePer(Permission p) {
		String sql = "update permissions set pName = '{pName}' where pID = {pID}";
		sql = SQLFilter.sqlFilter(sql, p);
		db.update(sql);
	}
	
	//添加权限方法
	public void addPer(String pName) {
		String sql = "insert into permissions (pName) values ('" + pName +"')";
		db.update(sql);
	}
}
