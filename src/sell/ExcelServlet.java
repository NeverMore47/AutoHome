package sell;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import entity.OrderInfo;

public class ExcelServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExcelServlet() {
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
	private OrderListService ols = new OrderListService();
	int k = 0;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List list = ols.selectALLOrder();

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("销售报表");
		HSSFRow row1 = sheet.createRow(0);
		HSSFCell cell = row1.createCell(0);
		cell.setCellValue("销售详情一览表");
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 7));

		// 第二行
		HSSFRow row2 = sheet.createRow(1);
		// 创建单元格并设置单元格内容
		row2.createCell(0).setCellValue("订单号");
		row2.createCell(1).setCellValue("客户号");
		row2.createCell(2).setCellValue("车编号");
		row2.createCell(3).setCellValue("车品牌");
		row2.createCell(4).setCellValue("成交价");
		row2.createCell(5).setCellValue("车型号");
		row2.createCell(6).setCellValue("车流向");
		row2.createCell(7).setCellValue("销售日期");

		Object rows[] = new Object[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			rows[i] = sheet.createRow(i + 2);
			((HSSFRow) rows[i]).createCell(0).setCellValue((((OrderInfo) list.get(i)).getoID()));
			((HSSFRow) rows[i]).createCell(1).setCellValue((((OrderInfo) list.get(i)).getClID()));
			((HSSFRow) rows[i]).createCell(2).setCellValue((((OrderInfo) list.get(i)).getcID()));
			((HSSFRow) rows[i]).createCell(3).setCellValue((((OrderInfo) list.get(i)).getcName()));
			((HSSFRow) rows[i]).createCell(4).setCellValue((((OrderInfo) list.get(i)).getoFinalPri()));
			((HSSFRow) rows[i]).createCell(5).setCellValue((((OrderInfo) list.get(i)).getcModel()));
			((HSSFRow) rows[i]).createCell(6).setCellValue((((OrderInfo) list.get(i)).getoFlow()));
			((HSSFRow) rows[i]).createCell(7).setCellValue((((OrderInfo) list.get(i)).getoDate()));
		}
		
		String path = "C:/Users/Administrator/Desktop/sellList"+ k +".xls";
		k++;

		FileOutputStream fileOut= new FileOutputStream(path);
		wb.write(fileOut);
        fileOut.close();
        response.sendRedirect("/AutoHome/sell/listorder.jsp");
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
