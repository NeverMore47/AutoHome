package visit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import film.FirmService;

public class DeleteVisitServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DeleteVisitServlet() {
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

		//删除厂商信息的方法DeleteFactory
		VisitService service = new VisitService();
		String[] rvIDs = request.getParameterValues("dels");
		
		if (rvIDs != null) {
			for (int i = 0; i < rvIDs.length; i++) {
				Integer rvID = Integer.parseInt(rvIDs[i]);
				System.out.println(rvID);
				service.deleteReturnVisit(rvID);
			}
			response.sendRedirect("/AutoHome/servlet/VisitServlet");
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

		//删除厂商信息的方法DeleteFactory
		VisitService service = new VisitService();
		String[] rvIDs = request.getParameterValues("dels");

		if (rvIDs != null) {
			for (int i = 0; i < rvIDs.length; i++) {
				Integer rvID = Integer.parseInt(rvIDs[i]);
				service.deleteReturnVisit(rvID);
			}
			response.sendRedirect("/AutoHome/servlet/DeleteVisitServlet");
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
