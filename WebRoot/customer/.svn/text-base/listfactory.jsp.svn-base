<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>客户管理</title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}
//-->
</script>
</head>
<script language="javascript" type="text/javascript">
        var popUp; 
		function openwin(idname)
		{
			popUp = window.open('date.html?formname=form1&id=' + idname,
			'ѡ������',
			'height=180, width=200,left=300,top=150, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no');
		}

		function SetDate(id,newDate)
		{
			
			popUp.close();
			form1.elements[id].value = newDate;
		}
</script>
<body>
<table class="maintable" border="0" width="100%" cellspacing="0">
	<tr>
		<td background="../images/topBarBg.gif">客户管理</td>
		<td width="20" height="23" background="../images/topBarBg.gif">
		<div align="right"><a href="#"><img
			src="../images/iHelp.gif" width="16" height="16" border="0"></a></div>
		</td>
	</tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0"
	bordercolor="#6490C2">
	<tr>
		<td width="25" height="24" background="../images/tab/firstLeftSel.gif">&nbsp;</td>
		<td width="100" background="../images/tab/middleSel.gif">
		<div align="center">厂商信息</div>
		</td>
		<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
		<td background="../images/tab/bg.gif">&nbsp;</td>
	</tr>
</table>
<form action="/AutoHome/servlet/FilmServlet?page=1" method="get">
<table class="maintable" border="0" width="100%" cellspacing="0">
	<tr>
	  <td width="3%" class="searchfontlist">&nbsp;</td>
		<td width="41%">　　　　　　　厂商信息：
		  <label>
		  <input type="text" name="textfield">
      </label></td>
	  <td width="47%" class="searchfontlist"><label>
	    <input type="submit" name="Submit3" value="查询">
	  </label></td>
		<td width="3%">&nbsp;</td>
		<td width="3%">&nbsp;</td>
		<td width="3%"></td>
	</tr>
</table>
</form>
<form action="/AutoHome/servlet/DeleteFactoryServlet" method="post">
  <table class="tablelistcontent" width="80%" border="1" cellspacing="1">
			<tr>
				<th width="73">选择</th>
				<th width="125">厂商编号</th>
				<th width="114">厂商名</th>
				<th width="104">厂商联系人</th>
				<th width="121">厂商联系电话</th>
				<th width="101">厂商邮编</th>
				<th width="87">厂商地址</th>
				<th width="147">修改</th>
			</tr>
			<c:forEach items="${film }" var="f">
				<tr class=Off onMouseOut="this.className='Off'"
					onMouseOver="this.className='Up'">
					<td height="24"><div align="center">
							<input type="checkbox" name="checkbox" value="${f.fID}"/>
						</div></td>
					<td><div align="center">${f.fID}</div></td>
					<td><div align="center">${f.fName}</div></td>
					<td><div align="center">${f.fContacts}</div></td>
					<td><div align="center">${f.fPhone}</div></td>
					<td><div align="center">${f.fCode}</div></td>
					<td><div align="center">${f.fAddress}</div></td>
					<td><div align="center">
							<a href="/AutoHome/servlet/UpdateFactoryServlet?fID=${f.fID}"><img
								src="../images/edit.gif" width="16" height="19" border="0">
							</a>
						</div></td>
				</tr>
			</c:forEach>
		</table>
  <table width="100%">
	<tr>
		<td height="40">
		  <div align="left">
		    <input type="button" name="Submit"
			value="添加厂商" onClick="window.location.href='../customer/addfactory.jsp'">
			 <input type="submit" name="Submit" value="删除厂商">
		</div><div align="center"></div>
		<div align="center"></div>
		</td>
		<td width="20">
		<div align="center"></div>
		</td>
		<td width="20">
		<div align="center"><a href="listResume.do?page=1"><img
			src="../images/report/firstPage.gif" width="17" height="11"
			border="0"></a></div>
		</td>
		<td width="20">
		<div align="center">
		  <c:if test="${showPage <= 1 }"></c:if>
		  <img
			src="../images/report/prePage.gif" width="14" height="11" border="0"></div>
		</td>
		<td width="20">
		<div align="center">
		  <c:if test="${showPage >= pageSum }"></c:if>
		  <img
			src="../images/report/nextPage.gif" width="14" height="11" border="0"></div>
		</td>
		<td width="20">
		<div align="center"><a href="listResume.do?page=${pageSum}"><img
			src="../images/report/endPage.gif" width="17" height="11" border="0"></a></div>
		</td>
		<td width="40">
		<div align="left"><a href="#">页次</a></div>
		</td>
		<td width="40">
		<div align="left"></div>
		</td>
		<td width="40">
		<div align="right">转至</div>
		</td>
		<td width="35" align="center"><input class="inputcontent"
			name="go" type="textfield" size="5"></td>
		<td width="80" align="center"><input type="image" name="Submit2" src="../images/report/go.gif"></td>
		<td width="6"></td>
	</tr>
</table>
</form>
</body>
</html>
