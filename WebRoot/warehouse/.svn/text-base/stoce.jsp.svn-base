<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<script language="JavaScript" type="text/JavaScript">
	
</script>
<style type="text/css">
<!--
.style2 {
	font-size: 12px
}
-->
</style>
</head>
<body>
	<table border="0" width="100%" cellspacing="0">
		<tr>
			<td background="../images/topBarBg.gif" height="23">仓库管理</td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bordercolor="#6490C2">
		<tr>
			<td width="25" height="24"
				background="../images/tab/firstLeftSel.gif">&nbsp;</td>
			<td width="100" background="../images/tab/middleSel.gif">
				<div align="center">仓库信息查看</div>
			</td>
			<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="../images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form name="editdemo" action="addResume.do" method="post">
		<table class="maintable" width="100%" border="0" cellspacing="0">
			<tr>
				<td width="12%" height="27">
					<div align="center">仓 库：</div>
				</td>
				<td width="13%"><div align="center">${selectWH.wName}</div></td>
				<td width="14%">&nbsp;</td>
				<td width="14%">&nbsp;</td>
				<td width="20%">
					<div align="center">仓库存储量：</div>
				</td>
				<td width="27%"><div align="center">${selectWH.wExist}</div></td>
			</tr>
			<tr>
				<td colspan="6">
					<hr color="#99CCFF">
				</td>
			</tr>
			<tr>
				<td height="23">
					<div align="center">仓库地址：</div>
				</td>
				<td colspan="5"><div align="center">${selectWH.wAddress}</div></td>
			</tr>
			<tr>
				<td colspan="6">
					<hr color="#99CCFF">
				</td>
			</tr>
			<c:forEach items="${cars}" var="c">
				<tr>
					<td><div align="center">汽车名称：</div></td>
					<td><div align="center">${c.cName}</div></td>
					<td><div align="center">型号：</div></td>
					<td><div align="center">${c.cModel}</div></td>
					<td><div align="center">数 量：</div></td>
					<td><div align="center">${c.cQuantity}</div></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
