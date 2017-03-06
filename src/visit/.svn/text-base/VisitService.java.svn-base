package visit;

import java.util.List;

import dao.DBOperational;

import entity.Firm;
import entity.ReturnVisitClients;

public class VisitService {
	private DBOperational dao = new DBOperational();
	//模糊查询所有回访信息的方法
	public List queryReturnVisit(String textfieldclName,String mailingTime){
		String sql = "SELECT * FROM autohome.r_c where clName like '%"+ textfieldclName + "%' and rvDate like '%"+ mailingTime + "%'";
		List list = dao.selectAll(sql, ReturnVisitClients.class);
		return list;
	}
	//执行删除的方法
	public void deleteReturnVisit(Integer rvID) {
		String sql = "delete from autohome.returnvisit where rvID = " + rvID;
		dao.update(sql);
	}
	
}
