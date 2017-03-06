package wareHouse;

import java.util.List;

import dao.DBOperational;
import entity.CarInfo;
import entity.Client;
import entity.ClientJSON;

public class TableService {

	private DBOperational db = new DBOperational();
	
	public List selectQuan(Integer wID) {
		String sql = "SELECT cName,cQuantity FROM carinfo WHERE wID = " + wID;
		List list = db.selectAll(sql, CarInfo.class);
		return list;
	}
	
	//查询客户信息
	public List selectClient() {
		String sql = "SELECT clAddress,COUNT(clAddress) AS clNum from clients GROUP BY clAddress;";
		List list = db.selectAll(sql, ClientJSON.class);
		return list;
	}
}
