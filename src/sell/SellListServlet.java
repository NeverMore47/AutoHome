package sell;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SellListServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SellListServlet() {
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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] oIDs = request.getParameterValues("dels");
		for(int i = 0; i < oIDs.length; i++) {
			Integer oID = Integer.parseInt(oIDs[i]);
			ols.deleteOrder(oID);
		}
		response.sendRedirect("/AutoHome/sell/SellList.jsp");
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
	private OrderListService ols = new OrderListService();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tj1 = request.getParameter("textfield");
		List result = null;
		if(tj1.equals("")) {
			List list = ols.selectALLOrder();
			request.getSession().setAttribute("sellList", list);
			response.sendRedirect("/AutoHome/sell/SellList.jsp");
		}else {
			String tj = request.getParameter("select");
			if(tj.equals("oID")) {
				Integer oID = Integer.parseInt(tj1);
				result = ols.selectByTj("oID", oID);
			}else if(tj.equals("clID")) {
				Integer clID = Integer.parseInt(tj1);
				result = ols.selectByTj("clID", clID);
			}else if(tj.equals("cID")) {
				Integer cID = Integer.parseInt(tj1);
				result = ols.selectByTj("cID", cID);
			}else {
				String cName = tj1;
				result = ols.selectByName(cName);
			}
			request.getSession().setAttribute("sellList", result);
			response.sendRedirect("/AutoHome/sell/SellList.jsp");
		}
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
