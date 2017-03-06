package system;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Role;

public class UpdateRoleServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpdateRoleServlet() {
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

		String rIDStr = request.getParameter("rID");
		String[] rIDs = rIDStr.split(",");
		
		for(int i= 0; i < rIDs.length;i++) {
			Integer rID = Integer.parseInt(rIDs[i]);
			lrs.deleteRole(rID);
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
	private ListRoleService lrs = new ListRoleService(); 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer rID = Integer.parseInt(request.getParameter("rID"));
		String rName = request.getParameter("roleName");
		String rDesc = request.getParameter("roleDepict");
		Integer pID = Integer.parseInt(request.getParameter("per"));
		
		Role role = new Role();
		role.setrID(rID);
		role.setrName(rName);
		role.setrDesc(rDesc);
		role.setpID(pID);
		
		lrs.updateRole(role);
		response.sendRedirect("/AutoHome/system/listrole.jsp");
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
