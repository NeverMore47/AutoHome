<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script language="javascript" type="text/javascript"
	src="../js/birthday.js"></script>
<script language="JavaScript" type="text/JavaScript">

</script>
</head>
<script language="javascript" type="text/javascript">
	function checkAll() {
		var obj = document.getElementById("all");
		var arr = document.getElementsByName("dels");
		for ( var i = 0; i < arr.length; i++) {
			arr[i].checked = obj.checked;
		}
	}
</script>
<body>
	<form action="/AutoHome/servlet/SellListServlet" method="post">
		<table class="maintable" border="0" width="100%" cellspacing="0">
			<tr>
				<td background="../images/topBarBg.gif">订单列表</td>
				<td width="20" height="23" background="images/topBarBg.gif">
					<div align="right">
						<a href="#"><img src="images/iHelp.gif" width="16" height="16"
							border="0"> </a>
					</div>
				</td>
			</tr>
		</table>


		<p>
			<label> <br> <label>查询条件:</label> <select name="select">
								<option value="oID">订单号</option>
								<option value="clID">客户号</option>
								<option value="cID">车编号</option>
								<option value="cName">车名称</option>
						</select>
			</label> <label> <input type="text" name="textfield">
			</label>
			</label> <label> <input type="submit" name="Submit" value="查询">
			</label>
		</p>
		</form>
		<label></label>
		<p>
			<label></label>
		</p>
		<p>&nbsp;</p>
		<form action="/AutoHome/servlet/SellListServlet">
		<table class="tablelistcontent" width="100%" border="1"
			cellspacing="1">

			<tr>
				<th width="29"><input type="checkbox" name="all" id="all"
					onClick="checkAll()"></th>
				<th width="203">订单号</th>
				<th width="236">客户号</th>
				<th width="224">车名称</th>
				<th width="195">车类型</th>
				<th width="196">销售时间</th>
			</tr>


		<c:forEach items="${sellList}" var="s">
			<tr class=Off onMouseOut="this.className='Off'"
				onMouseOver="this.className='Up'">
				<td height="24">
					<div align="center">
						<input type="checkbox" name="dels" value="">
					</div>
				</td>
				<td>
					<div align="center">${s.oID}</div>
				</td>
				<td>
					<div align="center">${s.clID}</div>
				</td>
				<td>
					<div align="center">${s.cName}</div>
				</td>
				<td>
					<div align="center">${s.cModel}</div>
				</td>
				<td>
					<div align="center">${s.oDate}</div>
				</td>
			</tr>
		</c:forEach>


		</table>
		<p>
			<input name="submit" type="submit" value="删除">
		</p>
		<p>&nbsp;</p>
	</form>
</body>
</html>
