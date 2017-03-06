package sell;

import java.util.List;

import dao.DBOperational;
import entity.OrderInfo;

public class OrderListService {

	private DBOperational db = new DBOperational();
	
	//查询所有订单信息
	public List selectALLOrder() {
		String sql = "SELECT * FROM c_o";
		List list = db.selectAll(sql, OrderInfo.class);
		return list;
	}
	
	//按条件查询订单信息
	public List selectByTj(String tj,Integer id) {
		String sql = "SELECT * FROM c_o where " + tj + "=" + id;
		List list = db.selectAll(sql, OrderInfo.class);
		return list;
	}
	
	//按汽车品牌查询
	public List selectByName(String cName) {
		String sql = "SELECT * FROM c_o where cName like '%" + cName + "%'";
		List list = db.selectAll(sql, OrderInfo.class);
		return list;
	}
	
	//删除
	public void deleteOrder(Integer oID) {
		String sql = "DELETE FROM orders WHERE oID = " + oID;
		db.update(sql);
	}
	
	
	
	
	
	
	
	
	
}
