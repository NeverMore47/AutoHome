<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>销售管理</title>
<script type="text/javascript" src="/AutoHome/sell/jquery-2.1.0.js"></script>
<link type="text/css" rel="stylesheet" href="../css/public.css">
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
	<table class="maintable" border="0" width="100%" cellspacing="0">
		<tr>
			<td background="../images/topBarBg.gif">销售管理</td>
			<td width="20" height="23" background="../images/topBarBg.gif">
				<div align="right">
					<a href="#"><img src="../images/iHelp.gif" width="16"
						height="16" border="0"></a>
				</div>
			</td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bordercolor="#6490C2">
		<tr>
			<td width="25" height="24"
				background="../images/tab/firstLeftSel.gif">&nbsp;</td>
			<td width="100" background="../images/tab/middleSel.gif">
				<div align="center">销售信息</div>
			</td>
			<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="../images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="/AutoHome/servlet/OrderListServlet" method="post">
		<table class="maintable" border="0" width="100%" cellspacing="0">
			<tr>
				<td width="22%" height="48" class="searchfontlist">
					<div align="right">
						<label> 查询条件: <select name="select">
								<option value="oID">订单号</option>
								<option value="clID">客户号</option>
								<option value="cID">车编号</option>
								<option value="cName">车名称</option>
						</select>
						</label>
					</div>
				</td>
				<td width="19%">
					<div align="left">
						<input type='text' name='menu1' />
					</div>
				</td>
				<td width="5%">&nbsp;</td>
				<td width="54%"><input type="submit"
						name="Submit3" value="查询">
				</label></td>
			</tr>

		</table>
		<p>&nbsp;</p>
	</form>
	<form action="/AutoHome/servlet/DeleteOrderServlet" method="post">
		<table class="tablelistcontent" width="100%" border="1"
			cellspacing="1">

			<tr>
				<th width="50"><label> <input type="checkbox" id="all"
						value="checkbox" onclick="checkAll()">
				</label></th>
				<th width="87">订单号</th>
				<th width="79">客户号</th>
				<th width="72">车编号</th>
				<th width="66">车名称</th>
				<th width="66">成交价</th>
				<th width="77">车类型</th>
				<th width="96">车流向</th>
				<th width="90">销售日期</th>
			</tr>
			<c:forEach items="${orderList}" var="o">
				<tr class=Off onMouseOut="this.className='Off'"
					onMouseOver="this.className='Up'">
					<td height="24"><div align="center">
							<input type="checkbox" name="dels" value="${o.oID}">
						</div></td>
					<td><div align="center">${o.oID}</div></td>
					<td><div align="center">${o.clID}</div></td>
					<td><div align="center">${o.cID}</div></td>
					<td><div align="center">${o.cName}</div></td>
					<td><div align="center">${o.oFinalPri}</div></td>
					<td><div align="center">${o.cModel}</div></td>
					<td><div align="center">${o.oFlow}</div></td>
					<td><div align="center">${o.oDate}</div></td>
				</tr>
			</c:forEach>
			<tr><td><a href="/AutoHome/servlet/ExcelServlet" onclick="showTip()">生成报表</a></td></tr>
			<script type="text/javascript">
				function showTip() {
					alert("生成成功，请到桌面查看");
				}
			</script>
		</table>
		<table width="100%">
			<tr>
				<td height="40" align="center" valign="middle">
					<div align="left">
						<label></label> <input type="submit" name="Submit" value="删除">
					</div>
					<div align="center"></div>
					<div align="center"></div>
				</td>
				<td width="20">
					<div align="center"></div>
				</td>
				<td width="20">
					<div align="center">
						<a href="listResume.do?page=1"><img
							src="../images/report/firstPage.gif" width="17" height="11"
							border="0"></a>
					</div>
				</td>
				<td width="20">
					<div align="center">
						<c:if test="${showPage <= 1 }"></c:if>
						<img src="../images/report/prePage.gif" width="14" height="11"
							border="0">
					</div>
				</td>
				<td width="20">
					<div align="center">
						<c:if test="${showPage >= pageSum }"></c:if>
						<img src="../images/report/nextPage.gif" width="14" height="11"
							border="0">
					</div>
				</td>
				<td width="20">
					<div align="center">
						<a href="listResume.do?page=${pageSum}"><img
							src="../images/report/endPage.gif" width="17" height="11"
							border="0">
					</div>
				</td>
				<td width="40">
					<div align="left">
						<a href="#">页次</a>
					</div>
				</td>
				<td width="40">
					<div align="left"></div>
				</td>
				<td width="40">
					<div align="right">转至</div>
				</td>
				<td width="35" align="center"><input class="inputcontent"
					name="go" type="textfield" size="5"></td>
				<td width="80" align="center"><input type="image"
					name="Submit2" src="../images/report/go.gif"></td>
				<td width="6"></td>
			</tr>
		</table>
	</form>
</body>
</html>
