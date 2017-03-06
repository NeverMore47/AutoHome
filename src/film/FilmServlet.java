package film;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilmServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FilmServlet() {
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
		String textfield = request.getParameter("textfield");
		if(textfield == null){
			textfield = "";
		}
		FirmService service = new FirmService();
		List list = service.queryFirms(textfield);
		request.setAttribute("film", list);
		request.getRequestDispatcher("../customer/listfactory.jsp").forward(request, response);
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
		String textfield = request.getParameter("textfield");
		if(textfield == null){
			textfield = "";
		}
		FirmService service = new FirmService();
		List list = service.queryFirms(textfield);
		request.setAttribute("film", list);
		request.getRequestDispatcher("../customer/listfactory.jsp").forward(request, response);
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
