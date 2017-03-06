package system;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Permission;

public class UpdatePerServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpdatePerServlet() {
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
	private ListPerService lps = new ListPerService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer pID = Integer.parseInt(request.getParameter("pID"));
		List list = lps.selectUpPer(pID);
		Permission pm = (Permission) list.get(0);
		request.getSession().setAttribute("perInfo", pm);
		response.sendRedirect("/AutoHome/system/updatepur.jsp");
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

		Integer pID = Integer.parseInt(request.getParameter("pID"));
		String pName = request.getParameter("roleDepict");
		Permission p = new Permission();
		p.setpID(pID);
		p.setpName(pName);
		lps.updatePer(p);
		response.sendRedirect("/AutoHome/system/listpur.jsp");
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
