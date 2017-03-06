package clients;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;

import entity.Client;
import entity.Firm;

public class CustomerService {
	private DBOperational dao = new DBOperational();
	//��ѯ���й˿͵ķ���
	public List queryClients(String textfield){
		String sql = "select * from autohome.clients where clName like '%"+ textfield + "%' ";
		List list = dao.selectAll(sql, Client.class);
		return list;
	}
	//ִ�����ӵķ���
	public void addCustomer(Client customer) {
		String sql = "INSERT INTO autohome.clients(clName,clGen,clPhone,clIDNum,clAddress) VALUES ('{clName}','{clGen}',{clPhone},'{clIDNum}','{clAddress}')";
		sql = SQLFilter.sqlFilter(sql, customer);
		dao.update(sql);
	}
	
	//ִ��ɾ��ķ���
	public void deleteCustomer(Integer clID) {
		String sql = "delete from autohome.clients where clID = " + clID;
		dao.update(sql);
	}
	//ִ���޸ĵ�ʱ����ĳһ��clidΪ��Ĳ�ѯ����
	public List selectUpCustomer(Integer clID) {
		String sql = "select * from autohome.clients where clID = " + clID;
		List list = dao.selectAll(sql, Client.class);
		return list;
	}
	//ִ���޸ĵķ���
	public void updateCustomer(Client customer) {
		String sql = "update autohome.clients set clName = '{clName}',clGen = '{clGen}',clPhone = {clPhone},clIDNum = '{clIDNum}',clAddress = '{clAddress}' where clID = {clID}";
		sql = SQLFilter.sqlFilter(sql, customer);
		dao.update(sql);
	}
}
