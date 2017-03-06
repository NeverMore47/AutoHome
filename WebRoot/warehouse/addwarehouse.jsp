<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>简历中心</title>
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script language="javascript">
	function showTip() {

		if ($("#name").val() != "" && $("#add").val() != ""
				&& $("#max").val() != "") {
				var wMax = $("#name").val();
			$.ajax({
				url:"/AutoHome/servlet/AddWHServlet",
				data:{max:wMax},
				dataType:"json",
				success:function(result) {
					if(!result) {
						$("#test_name").css("display","block");
					}else {
						$("#test_name").css("display","none");
						$("#submit").attr("disabled", false);
					}
				}
			});
		}

	}
</script>
<body>
	<table border="0" width="100%" cellspacing="0">
		<tr>
			<td background="images/topBarBg.gif" height="23"><strong>
					<div class="searchfontlist">仓库管理</div>
			</strong></td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bordercolor="#6490C2">
		<tr>
			<td width="25" height="24" background="images/tab/firstLeftSel.gif">&nbsp;

			</td>
			<td width="100" background="images/tab/middleSel.gif">
				<div align="center">增加仓库</div>
			</td>
			<td width="50" background="images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="/AutoHome/servlet/AddWHServlet" method="post"
		onSubmit="return subUser()">
		<table class="maintable" width="100%" border="0" cellspacing="0">
			<tr>
				<td width="104">
					<div align="right">仓库名称：</div>
				</td>
				<td height="24"><input name="text" type="text"
					class="inputcontent" id="text" size="20" maxlength="16" id="name" /></td>
				<td height="24">
					<div id="test_password" style="display:none">
						<font color="#FF0000">仓库名称不能为空</font>
					</div>
				</td>
			</tr>

			<tr>
				<td width="104">
					<div align="right">仓库位置：</div>
				</td>
				<td height="24"><input name="address" type="text"
					class="inputcontent" id="text" size="20" maxlength="16" id="add" /></td>
				<td height="24">
					<div id="test_password" style="display:none">
						<font color="#FF0000">仓库位置不能为空</font>
					</div>
				</td>
			</tr>

			<tr>
				<td width="104">
					<div align="right">仓库储存量：</div>
				</td>
				<td height="24"><input name="wMax" type="text"
					class="inputcontent" id="name" size="20" onblur="showTip()"
					id="max"><span id="test_name" style="display:none" align="left">
						<font color="#FF0000">存储量只能为整数</font>
					</span></td>
				<td height="24" align="left">
					
				</td>
			</tr>
		</table>
		<table align="right" width="100%">
			<tr>
				<td height="30" width="70"></td>
				<td width="65"><input type="submit" name="Submit" value="确定"
					disabled="disabled" id="submit"></td>
				<td width="96">
					<div align="center">
						<label> <input type="button" name="Submit" value="返回"
							onClick="history.back()">
						</label>
					</div>
				</td>
				<td width="60">&nbsp;</td>
				<td width="486"></td>
			</tr>
			<tr>
				<td height="30" colspan="5" background="images/tab/bg.gif"></td>
			</tr>
		</table>
		<input type="hidden" name="uid" value="${viewuser.uid }">
	</form>
</body>
</html>
