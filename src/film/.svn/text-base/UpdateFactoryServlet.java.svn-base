package film;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Firm;
import entity.Permission;

public class UpdateFactoryServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpdateFactoryServlet(){
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
		//这是点击修改时跳转到修改页面显示的信息
		FirmService afs = new FirmService();
		Integer fID = Integer.parseInt(request.getParameter("fID"));
		List list = afs.selectUpfactory(fID);
		Firm factory = (Firm) list.get(0);
		request.getSession().setAttribute("factoryinfo", factory);
		response.sendRedirect("/AutoHome/customer/updatafactory.jsp");
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
		//这是获取修改后传入数据库的信息
		Integer fID = Integer.parseInt(request.getParameter("fID"));
		String fName = request.getParameter("fName");
		String fContacts  = request.getParameter("fContacts");
		Integer fPhone = Integer.parseInt(request.getParameter("fPhone"));
		Integer fCode = Integer.parseInt(request.getParameter("fCode")); 
		String fAddress = request.getParameter("fAddress");
		Firm factory = new Firm();
		factory.setfID(fID);
		factory.setfName(fName);
		factory.setfContacts(fContacts);
		factory.setfPhone(fPhone);
		factory.setfCode(fCode);
		factory.setfAddress(fAddress);
		FirmService afs = new FirmService();
		afs.updatefactory(factory);
		response.sendRedirect("/AutoHome/servlet/FilmServlet");
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
