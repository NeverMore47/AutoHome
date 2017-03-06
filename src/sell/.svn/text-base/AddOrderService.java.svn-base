package sell;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;
import entity.CarInfo;
import entity.Order;

public class AddOrderService {

	private DBOperational db = new DBOperational();
	
	//查询默认生成订单号
	public List selectoID() {
		String sql = "SELECT oID FROM orders ORDER BY oID DESC LIMIT 1";
		List list = db.selectAll(sql, Order.class);
		return list;
	}
	
	public void addOrder(Order order) {
		String sql = "INSERT INTO orders (oFinalPri,oFlow,oDate,cID,clID) VALUES ({oFinalPri},'{oFlow}','{oDate}',{cID},{clID})";
		sql = SQLFilter.sqlFilter(sql, order);
		db.update(sql);
	} 
	
	//查询车辆名称 型号
	public List selectCarByAjax(Integer cID) {
		String sql = "SELECT cModel,cName FROM carinfo WHERE cID = " + cID;
		List list = db.selectAll(sql, CarInfo.class);
		return list;
	} 
	
	
	
	
	
	
	
}

