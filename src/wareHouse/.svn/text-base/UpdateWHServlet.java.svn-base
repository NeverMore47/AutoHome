package wareHouse;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.MapToEntiy;
import entity.WareHouse;

public class UpdateWHServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpdateWHServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	private ListWHService lws = new ListWHService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer wID = Integer.parseInt(request.getParameter("wID"));
		List list = lws.selectUpWH(wID);
		WareHouse wh = (WareHouse) list.get(0);
		request.getSession().setAttribute("whUp", wh);
		response.sendRedirect("/AutoHome/warehouse/updatawarehouse.jsp");
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer wID = Integer.parseInt(request.getParameter("wID"));
		String wName = request.getParameter("wName");
		String wAddress = request.getParameter("wAddress");
		Integer wMax = Integer.parseInt(request.getParameter("wMax"));
		Integer wExist = Integer.parseInt(request.getParameter("wExist"));
		
		WareHouse wh = new WareHouse();
		if(wID != null && wName != null && wAddress != null && wMax != null && wExist != null) {	
			wh.setwID(wID);
			wh.setwName(wName);
			wh.setwAddress(wAddress);
			wh.setwMax(wMax);
			wh.setwExist(wExist);
			lws.updateWH(wh);
		}
		response.sendRedirect("/AutoHome/warehouse/warehouseList.jsp");
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
