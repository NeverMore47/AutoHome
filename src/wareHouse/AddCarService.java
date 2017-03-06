package wareHouse;

import java.util.List;

import util.SQLFilter;

import dao.DBOperational;
import entity.CarInfo;
import entity.WareHouse;

public class AddCarService {

	private DBOperational db = new DBOperational();

	// 判断汽车编号是否存在
	public List select_cID(Integer cID) {
		String sql = "select * from carinfo where cID = " + cID;
		List list = db.selectAll(sql, CarInfo.class);
		return list;
	}

	// 添加汽车方法
	public void addCar(CarInfo car) {
		String sql = "INSERT INTO carinfo VALUES({cID},'{cModel}','{cEngine}','{cFlow}','{cProDate}','{cName}',{wID},'{cDesc}',{cQuantity},'{cDate}','{cPro}','{cColor}')";
		sql = SQLFilter.sqlFilter(sql, car);
		db.update(sql);
	}
	
	//添加车辆减库存方法
	public void minusWH(Integer wID,Integer cQuantity) {
		String sql = "SELECT wExist FROM warehouse WHERE wID = " + wID;
		List list = db.selectAll(sql, WareHouse.class);
		WareHouse wh = (WareHouse) list.get(0);
		Integer wExist = wh.getwExist();
		wExist = wExist - cQuantity;
		String sql1 = "UPDATE warehouse set wExist = "+ wExist +" WHERE wID = " + wID;
		db.update(sql1);
	}
}
