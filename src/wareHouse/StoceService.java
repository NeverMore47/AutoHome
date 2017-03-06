package wareHouse;

import java.util.List;

import dao.DBOperational;
import entity.CarInfo;
import entity.WareHouse;

public class StoceService {

	private DBOperational db = new DBOperational();

	// 查询出所有汽车品牌
	public List selectCarName(Integer wID) {
		String sql = "select cName from carinfo where wID = " + wID;
		List list = db.selectAll(sql, CarInfo.class);
		return list;
	}

	// 查询仓库信息
	public List selectWH(Integer wID) {
		String sql = "select * from warehouse where wID = " + wID;
		List list = db.selectAll(sql, WareHouse.class);
		return list;
	}

	// 查询仓库车辆信息
	public List carWh(Integer wID, String cName, String cModel) {
		String sql = "SELECT cModel,cName,cQuantity FROM carinfo where wID = "
				+ wID;
		StringBuffer sb = new StringBuffer();
		sb.append(sql);
		if (!cName.equals("--请选择--")) {
			sb.append(" and cName = '" + cName + "'");
		} else if (!cModel.equals("")) {
			sb.append(" and cModel like '%" + cModel + "%'");
		}
		sql = sb.toString();
		List list = db.selectAll(sql, CarInfo.class);
		return list;
	}
}
