package film;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;
import entity.Firm;
import entity.Permission;
import entity.User;
import entity.UserInfo;

public class FirmService {
	private DBOperational dao = new DBOperational();
	//查询所有厂商的方法
	public List queryFirms(String textfield){
		String sql = "select * from autohome.firm where fName like '%"+ textfield + "%' ";
		List list = dao.selectAll(sql, Firm.class);
		return list;
	}

	//执行增加的方法
	public void addfactory(Firm factory) {
		String sql = "INSERT INTO autohome.firm(fName,fContacts,fPhone,fCode,fAddress) VALUES ('{fName}','{fContacts}',{fPhone},{fCode},'{fAddress}')";
		sql = SQLFilter.sqlFilter(sql, factory);
		dao.update(sql);
	}

	//执行删除的方法
	public void deletefactory(Integer fID) {
		String sql = "delete from autohome.firm where fID = " + fID;
		dao.update(sql);
	}
	
	//执行修改的方法
	public void updatefactory(Firm factory) {
		String sql = "update autohome.firm set fName = '{fName}',fContacts = '{fContacts}',fPhone = {fPhone},fCode = {fCode},fAddress = '{fAddress}' where fID = {fID}";
		sql = SQLFilter.sqlFilter(sql, factory);
		dao.update(sql);
	}
	//执行修改的时候以某一条fid为例的查询方法
	public List selectUpfactory(Integer fID) {
		String sql = "select * from autohome.firm where fID = " + fID;
		List list = dao.selectAll(sql, Firm.class);
		return list;
	}
}
