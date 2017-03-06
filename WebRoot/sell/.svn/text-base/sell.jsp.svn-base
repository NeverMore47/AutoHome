<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
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
		<td background="../images/topBarBg.gif">销售管理</td>
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
		<div align="center">汽车信息</div>
		</td>
		<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
		<td background="../images/tab/bg.gif">&nbsp;</td>
	</tr>
</table>
<form action="listResume.do?page=1" method="post">
<table class="maintable" border="0" width="100%" cellspacing="0">
	<tr>
		<td class="searchfontlist">
		<div align="right">汽车型号：:</div>
		</td>
		<td>
		<div align="left">
		  <input type='text' name='menu1'/>
		</div>
		</td>
		<td class="searchfontlist">
		<div align="right">汽车类型:</div>
		</td>
		<td>
		<div align="left">
		  <select name="menu2" >
            <option value=''>请选择</option>
           
            	<option ></option>
    

          </select>
		</div>
		</td>
		<td>
		<div align="center"><input type="image" name="Submit" value="查询"
			src="../images/report/query.gif"></div>
		</td>
		<td></td>
	</tr>
</table>
</form>
<form action="deleteResume.do" method="post">
<table class="tablelistcontent" width="100%" border="1" cellspacing="1">
	<tr>
		<th width="50">选择</th>
		<th width="87">汽车编号</th>
		<th width="79">汽车名称</th>
		<th width="72">汽车型号</th>
		<th width="66">汽车颜色</th>
		<th width="66">发动机号</th>
		<th width="77">生产地</th>
		<th width="96">出厂日期</th>
		<th width="90">车辆流向</th>
		<th width="69">车辆用途</th>
	<th width="105">修改</th>
	</tr>
	
	<tr class=Off onMouseOut="this.className='Off'"
		onMouseOver="this.className='Up'">
		<td height="24">
		  <div align="center">
		    <input type="checkbox" name="checkbox"
			>
		  </div></td>
		<td><div align="center">001</div></td>
		<td>
		<div align="center">奔驰</div>		</td>
		<td>
	    <div align="center">s600</div>	  </td>
		<td>
		<div align="center">黑色</div>		</td>
		<td>
	    <div align="center">523</div></td>
		<td>
		<div align="center">上海</div>		</td>
		<td>
		<div align="center">2008-08-08</div>		</td>
		<td>
		<div align="center">武汉</div>		</td>
		<td>
		<div align="center">家用</div>		</td>
	<td><div align="center"><a href="preEditResume.do">修改</a></div></td>
	</tr>
	
</table>
<table width="100%">
	<tr>
		<td height="40">
		<div align="left"><input type="checkbox" name="checkbox4"
			value="checkbox"> 全选 <input type="button" name="Submit"
			value="录入" onClick="window.location.href='preAddResume.do'">
			 <input type="submit" name="Submit" value="删除">
		</div>
		<div align="center"></div>
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
			src="../images/report/endPage.gif" width="17" height="11" border="0"></div>
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
