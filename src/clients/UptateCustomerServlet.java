package clients;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Client;
import entity.Firm;
import film.FirmService;

public class UptateCustomerServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UptateCustomerServlet() {
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

		//���ǵ���޸�ʱ��ת���޸�ҳ����ʾ����Ϣ
		CustomerService cs = new CustomerService();
		Integer clID = Integer.parseInt(request.getParameter("clID"));
		List list = cs.selectUpCustomer(clID);
		Client customer = (Client) list.get(0);
		request.getSession().setAttribute("customerinfo", customer);
		response.sendRedirect("/AutoHome/customer/updatacustomer.jsp");
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

		//���ǻ�ȡ�޸ĺ�����ݿ����Ϣ
		Integer clID = Integer.parseInt(request.getParameter("clID"));
		String clName = request.getParameter("clName");
		String clGen  = request.getParameter("clGen");
		Integer clPhone = Integer.parseInt(request.getParameter("clPhone"));
		String clIDNum = request.getParameter("clIDNum"); 
		String clAddress = request.getParameter("clAddress");
		Client customer = new Client();
		customer.setClID(clID);
		customer.setClName(clName);
		customer.setClGen(clGen);
		customer.setClPhone(clPhone);
		customer.setClIDNum(clIDNum);
		customer.setClAddress(clAddress);
		CustomerService cs = new CustomerService();
		cs.updateCustomer(customer);
		response.sendRedirect("/AutoHome/servlet/CustomerServlet");
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
