<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link type="text/css" rel="stylesheet" href="../css/public.css">
</head>
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<script language="javascript" type="text/javascript">
	$(function() {
		window.location.href = "/AutoHome/servlet/ListPerServlet";
	});
	function checkAll() {
		var obj = document.getElementById("all");
		var arr = document.getElementsByName("dels");
		for ( var i = 0; i < arr.length; i++) {
			arr[i].checked = obj.checked;
		}
	}
</script>
<body>
	<form name="pur" action="/AutoHome/servlet/ListPerServlet"
		method="post">
		<table class="maintable" border="0" width="100%" cellspacing="0">
			<tr>
				<td background="../images/topBarBg.gif">系统管理：权限管理</td>
				<td width="20" height="23" background="images/topBarBg.gif">
					<div align="right">
						<a href="#"><img src="images/iHelp.gif" width="16" height="16"
							border="0"> </a>
					</div>
				</td>
			</tr>
		</table>



		<table class="tablelistcontent" width="100%" border="1"
			cellspacing="1">
			<tr>
				<th width="27"><input type="checkbox" name="checkbox"
					value="checkbox" id="all" onclick="checkAll()"></th>
				<th>权限编号</th>
				<th width="521">权限</th>
				<th>修改</th>
			</tr>

			<c:forEach items="${listPer}" var="p">
				<tr class=Off onMouseOut="this.className='Off'"
					onMouseOver="this.className='Up'">
					<td height="24">
						<div align="center">
							<input name="dels" type="checkbox" value="${p.pID}" />
						</div>
					</td>
					<td>
						<div align="center">${p.pID}</div>
					</td>
					<td>
						<div align="center">${p.pName}</div>
					</td>

					<td>
						<div align="left"></div>
						<div align="center">
							<a href="/AutoHome/servlet/UpdatePerServlet?pID=${p.pID}"><img
								src="../images/edit.gif" width="16" height="19" border="0">
							</a>
						</div>
						<div align="center"></div>
					</td>
				</tr>
			</c:forEach>
		</table>

		<table width="100%">
			<tr>
				<td height="40" width="28">
					<div align="left"></div>
				</td>
				<td width="591">
					<div align="left">
						<input type="submit" name="submit" value="删除"">
					</div>
				</td>
				</form>

				<form action="/AutoHome/servlet/AddPerServlet" method="post">
					<td width="51">
						<div align="left">
							<p>添加权限</p>
						</div>
					</td>
					<td width="168">
						<div align="left">
							<input type="text" name="cc" id="cc">
						</div>
					</td>
					<td width="42">
						<div align="left">
							<input type="submit" name="submit" value="添加">
						</div>
					</td>
				</form>
			</tr>
		</table>
</body>
</html>
