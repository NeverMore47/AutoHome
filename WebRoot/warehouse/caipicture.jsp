<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>仓库管理</title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
</head>
<script language="javascript" type="text/javascript">
        var popUp; 
		function openwin(idname)
		{
			popUp = window.open('date.html?formname=form1&id=' + idname,
			'选择日期',
			'height=180, width=200,left=300,top=150, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no');
		}

		function SetDate(id,newDate)
		{
			
			popUp.close();
			form1.elements[id].value = newDate;
		}

function checkAll()
{
	var obj = document.getElementById("all");
	var arr = document.getElementsByName("dels");
	for(var i = 0; i < arr.length; i++)
	{
		arr[i].checked = obj.checked;
	} 
}
</script>
<body>
<table class="maintable" border="0" width="100%" cellspacing="0">
  <tr>
    <td background="../images/topBarBg.gif">图片信息</td>
    <td width="20" height="23" background="images/topBarBg.gif"><div align="right"><a href="#"><img src="images/iHelp.gif" width="16" height="16" border="0"></a></div></td>
  </tr>
</table>


  <form action="delrole.do" method="post">
    <p align="right">&nbsp;</p>
    <table width="55%" height="607" border="1" cellspacing="1" class="tablelistcontent">
      
        <tr class=Off onMouseOut="this.className='Off'" onMouseOver="this.className='Up'">
          <td width="22"><label>
            <input type="checkbox" name="checkbox" value="checkbox">
          </label></td>
          <td width="84" height="56"><div align="center">汽车名</div></td>
          <td width="84"><div align="center"><a href="viewrole.do?myid=${dto.rid }">汽车型号</a></div></td>
          <td width="280"><div align="center">图片信息</div></td>
        </tr>
        <tr class=Off onMouseOut="this.className='Off'" onMouseOver="this.className='Up'">
          <td><input type="checkbox" name="checkbox22" value="checkbox"></td>
          <td height="142"><div align="center">奔驰</div></td>
          <td><div align="center">S600</div></td>
          <td><div align="center"><img src="../images/carP/7.jpg" width="265" height="175"></div></td>
        </tr>
        <tr class=Off onMouseOut="this.className='Off'" onMouseOver="this.className='Up'">
          <td><div align="center">
            <input type="checkbox" name="checkbox23" value="checkbox">
          </div></td>
          <td height="45"> <div align="center">宝马</div></td>
          <td><div align="center">BB2</div></td>
          <td><div align="center"><img src="../images/carP/6.jpg" width="264" height="192"></div></td>
        </tr>
        <tr class=Off onMouseOut="this.className='Off'" onMouseOver="this.className='Up'">
          <td><label>
            <input type="checkbox" name="checkbox2" value="checkbox">
          </label></td>
          <td height="45"><div align="center"><a href="viewuser.jsp">法拉利</a></div></td>
          <td><div align="center"><a href="viewrole.do?myid=${dto.rid }">XX1</a></div></td>
          <td><div align="center"><img src="../images/carP/1.jpg" width="263" height="165"></div></td>
        </tr>
	  
	  
    </table>
	<div align="right">
	  <p><br>
	    <input type="file">
	  上传汽车图片</p>
	  <p>&nbsp;      </p>
	</div>
	<table width="100%">
    <tr>
      <td height="40" width="10"><div align="center"></div></td>
      <td width="50"><div align="center">
        <input type="submit" name="Submit" value="删除">
          </div></td>
      <td width="50"><div align="center"></div></td>
      <td width="86"><div align="center">
      </div></td>
      <td width="69"><div align="center">
      </div></td>
      <td width="69"><div align="center">
      </div></td>
      <td width="69"><div align="center">
	  </div></td>
      <td width="17"><div align="center"></div></td>
      <td width="19"><div align="center"><a href="listrole.do?page=1"><img src="../images/report/firstPage.gif" width="17" height="11" border="0"></a></div></td>
      <td width="19"><div align="center"><img src="../images/report/prePage.gif" width="14" height="11" border="0"></div></td>
      <td width="19"><div align="center"><img src="../images/report/nextPage.gif" width="14" height="11" border="0"></div></td>
      <td width="19"><div align="center"><a href="listrole.do?page=${pageSum}"><img src="../images/report/endPage.gif" width="17" height="11" border="0"></a></div></td>
      <td width="37"><div align="left"><a href="#">页次</a>:</div></td>
      <td width="37">&nbsp;</td>
      <td width="36"><div align="right">转至</div></td>
      <td width="35" align="center"><input name="go" type="text" size="2"></td>
      <td width="84" align="center"><input type="image" name="Submit2" src="../images/report/go.gif"></td>
	  <td width="0"></td>
    </tr>
</table>
</form>
</body>
</html>
