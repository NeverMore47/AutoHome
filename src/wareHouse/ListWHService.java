package wareHouse;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;
import entity.WareHouse;

public class ListWHService {
	
	private DBOperational db = new DBOperational();
	
	//查询所有仓库信息方法
	public List selectWH() {
		String sql = "SELECT * from warehouse";
		List list = db.selectAll(sql, WareHouse.class);
		return list;
	}
	
	//查询单个仓库信息
	public List selectUpWH(Integer wID) {
		String sql = "select * from warehouse where wID = " + wID;
		List list = db.selectAll(sql, WareHouse.class);
		return list;
	}
	
	//修改仓库信息
	public void updateWH(WareHouse wh) {
		String sql = "update warehouse set wName = '{wName}',wAddress = '{wAddress}',wMax = {wMax},wExist = {wExist} where wID = {wID}";
		sql = SQLFilter.sqlFilter(sql, wh);
		db.update(sql);
	}
	
	//删除仓库信息
	public void deleteWH(Integer wID) {
		String sql = "delete from warehouse where wID = " + wID;
		db.update(sql);
	}
	
	//添加仓库信息
	public void addWH(WareHouse wh) {
		String sql = "insert into warehouse (wName,wAddress,wMax) values ('{wName}','{wAddress}',{wMax})";
		sql = SQLFilter.sqlFilter(sql, wh);
		db.update(sql);
	}
	
	
	
	
	
	
}
