package visit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import film.FirmService;

public class VisitServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public VisitServlet() {
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
		//通过搜索栏位textfield向数据库获取厂商信息一个 post请求，并转发listfactory.jsp文件的form表单中
		String textfield = request.getParameter("textfieldclName");
		String mailingTime = request.getParameter("mailingTime");
		if(textfield == null && mailingTime == null){
			textfield = "";
		}
		VisitService service = new VisitService();
		List list = service.queryReturnVisit(textfield, mailingTime);
		request.setAttribute("returnVisit", list);
		request.getRequestDispatcher("../customer/visit.jsp").forward(request, response);
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

		//通过搜索栏位textfield向数据库获取厂商信息一个 post请求，并转发listfactory.jsp文件的form表单中
		String textfield = request.getParameter("textfieldclName");
		String mailingTime = request.getParameter("mailingTime");
		if(textfield == null && mailingTime == null){
			textfield = "";
		}
		VisitService service = new VisitService();
		List list = service.queryReturnVisit(textfield,mailingTime);
		request.setAttribute("returnVisit", list);
		request.getRequestDispatcher("../customer/visit.jsp").forward(request, response);
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
