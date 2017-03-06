package wareHouse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.CarInfo;

public class AddCarServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddCarServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
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
	private AddCarService acs = new AddCarService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cIDStr = request.getParameter("cID");
		if (!cIDStr.equals("") && isInteger(cIDStr)) {
			Integer cID = Integer.parseInt(request.getParameter("cID"));
			List list = acs.select_cID(cID);

			response.setContentType("application/json");
			if (list.size() > 0) {
				response.getWriter().print(false);
			} else {
				response.getWriter().print(true);
			}
		}

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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cIDStr = request.getParameter("cID");
		if (!cIDStr.equals("") && isInteger(cIDStr)) {
			if (isInteger(request.getParameter("cQuantity"))) {

				Integer cID = Integer.parseInt(cIDStr);
				String cModel = request.getParameter("cModel");
				String cEngine = request.getParameter("cEngine");
				String cFlow = request.getParameter("cFlow");
				String cProDate = request.getParameter("cProDate");
				String cName = request.getParameter("cName");
				String cColor = request.getParameter("cColor");
				String cPro = request.getParameter("cPro");
				Integer wID = Integer.parseInt(request.getParameter("wID"));
				Integer cQuantity = Integer.parseInt(request
						.getParameter("cQuantity"));
				String cDesc = request.getParameter("cDesc");
				Date date = new Date();
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				String cDate = df.format(date);

				CarInfo car = new CarInfo();
				car.setcID(cID);
				car.setcModel(cModel);
				car.setcEngine(cEngine);
				car.setcFlow(cFlow);
				car.setcPro(cPro);
				car.setcProDate(cProDate);
				car.setcName(cName);
				car.setcColor(cColor);
				car.setwID(wID);
				car.setcQuantity(cQuantity);
				car.setcDesc(cDesc);
				car.setcDate(cDate);
				acs.addCar(car);
				acs.minusWH(wID, cQuantity);
				
				
				response.sendRedirect("/AutoHome/warehouse/stocelist.jsp");
			}
		}
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
