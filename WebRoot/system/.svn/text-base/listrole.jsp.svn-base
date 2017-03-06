<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
</head>
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "/AutoHome/servlet/ListRoleServlet",
			type : "post"
		});
	});
</script>
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
			<td background="../images/topBarBg.gif">系统管理：角色管理</td>
			<td width="20" height="23" background="images/topBarBg.gif"><div
					align="right">
					<a href="#"><img src="images/iHelp.gif" width="16" height="16"
						border="0"></a>
				</div></td>
		</tr>
	</table>


	<form action="" method="post">
		<table class="tablelistcontent" width="100%" border="1"
			cellspacing="1">
			<tr>
				<th width="61"><div align="center">
						<input type="checkbox" name="checkbox" id="all" value="checkbox"
							onClick="checkAll()">
					</div></th>
				<th width="87"><div align="center">角色编号</div></th>
				<th width="93"><div align="center">角色名称</div></th>
				<th width="114"><div align="center">角色描述</div></th>
				<th width="348"><div align="center">权限</div></th>
				<th width="168">编辑</th>
			</tr>
			<c:forEach items="${roles }" var="r">
				<tr class=Off onMouseOut="this.className='Off'"
					onMouseOver="this.className='Up'">
					<td height="24"><div align="center">
							<input type="checkbox" name="dels" value="${r.rID }">
						</div></td>
					<td><div align="center">${r.rID}</div></td>
					<td><div align="center">
							<a href="viewrole.jsp">${r.rName}</a>
						</div></td>
					<td><div align="center">${r.rDesc}</div></td>
					<td><div align="center">
							<div align="center">
								<div align="center">${r.pName}</div>
							</div>
						</div></td>
					<td><div align="center">
							<a href="/AutoHome/servlet/ListRoleServlet?rID=${r.rID }"
								methods="get"><img src="../images/edit.gif" width="16"
								height="19" border="0"></a>
						</div>
						<div align="center"></div></td>
				</tr>
			</c:forEach>
		</table>
		<table width="100%">
			<tr>
				<td height="40" width="10"><div align="center"></div></td>
				<td width="50"><div align="center">
						<input type="button" name="Submit" value="删除"
							onClick="deleteRoles()">
						<script type="text/javascript">
							function deleteRoles() {
								var strSel = "";
								$("[name='dels']:checked").each(
										function(index, element) {
											strSel += $(this).val() + ",";
								});
								if (strSel != "") {
									$.ajax({
										url : "/AutoHome/servlet/UpdateRoleServlet",
										data : {
											rID : strSel
										},
										dataType : "json",
										success : function(result) {
											window.location.href = "listrole.jsp";
										}
									});
								}
							}
						</script>
					</div></td>
				<td width="50"><div align="center">
						<input type="button" name="Submit" value="添加"
							onClick="window.location.href='/AutoHome/servlet/AddRoleServlet'">
					</div></td>
				<td width="86"><div align="center"></div></td>
				<td width="69"><div align="center"></div></td>
				<td width="69"><div align="center"></div></td>
				<td width="69"><div align="center"></div></td>
				<td width="17"><div align="center"></div></td>
				<td width="19"><div align="center">
						<a href="listrole.do?page=1"><img
							src="../images/report/firstPage.gif" width="17" height="11"
							border="0">
					</div></td>
				<td width="19"><div align="center">
						<c:if test="${showPage <= 1 }"></c:if>
						<img src="../images/report/prePage.gif" width="14" height="11"
							border="0">
					</div></td>
				<td width="19"><div align="center">
						<img src="../images/report/nextPage.gif" width="14" height="11"
							border="0">
					</div></td>
				<td width="19"><div align="center">
						<a href="listrole.do?page=${pageSum}"><img
							src="../images/report/endPage.gif" width="17" height="11"
							border="0">
					</div></td>
				<td width="37"><div align="left">
						<a href="#">页次</a>:
					</div></td>
				<td width="37">&nbsp;</td>
				<td width="36"><div align="right">转至</div></td>
				<td width="35" align="center"><input name="go" type="text"
					size="2"></td>
				<td width="84" align="center"><input type="image"
					name="Submit2" src="../images/report/go.gif"></td>
				<td width="0"></td>
			</tr>
		</table>
	</form>
</body>
</html>
