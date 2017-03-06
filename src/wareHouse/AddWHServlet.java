package wareHouse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.WareHouse;

public class AddWHServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddWHServlet() {
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
	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String wMax = request.getParameter("max");
		boolean flag = isInteger(wMax);
		response.setContentType("application/json");
		response.getWriter().print(flag);
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
	private ListWHService lws = new ListWHService();

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String wName = request.getParameter("text");
		String wAddress = request.getParameter("address");
		Integer wMax = Integer.parseInt(request.getParameter("wMax"));

		WareHouse wh = new WareHouse();
		wh.setwName(wName);
		wh.setwAddress(wAddress);
		wh.setwMax(wMax);
		lws.addWH(wh);
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
