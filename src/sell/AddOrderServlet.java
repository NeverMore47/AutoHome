package sell;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import util.MapToEntiy;

import entity.CarInfo;
import entity.Order;

public class AddOrderServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddOrderServlet() {
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
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	private AddOrderService aos = new AddOrderService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(!request.getParameter("cID").equals("")) {
			Integer cID = Integer.parseInt(request.getParameter("cID"));
			List list = aos.selectCarByAjax(cID);
			
			if(list.size() > 0) {
				CarInfo car = (CarInfo) list.get(0);
				JSONArray ja = JSONArray.fromObject(car);
				response.getWriter().print(ja);
			}
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer cID = Integer.parseInt(request.getParameter("cID"));
		Integer clID = Integer.parseInt(request.getParameter("clID"));
		Double oFinalPri = Double.parseDouble(request.getParameter("oFinalPri"));
		String oFlow = request.getParameter("oFlow");
		String oDate = request.getParameter("oDate");
		Order order = new Order();
		order.setcID(cID);
		order.setClID(clID);
		order.setoFinalPri(oFinalPri);
		order.setoFlow(oFlow);
		order.setoDate(oDate);
		aos.addOrder(order);
		request.getRequestDispatcher("/sell/SellList.jsp").forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
