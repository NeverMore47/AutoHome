<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>简历中心</title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<body>
	<input type="hidden" id="roleId" value="">
	<input type="hidden" id="depId" value="">
	<input type="hidden" id="projectId" value="">
	<table border="0" width="100%" cellspacing="0">
		<tr>
			<td background="images/topBarBg.gif" height="23"><strong>
					<div class="searchfontlist">仓库信息</div>
			</strong></td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bordercolor="#6490C2">
		<tr>
			<td width="25" height="24" background="images/tab/firstLeftSel.gif">&nbsp;

			</td>
			<td width="100" background="images/tab/middleSel.gif">
				<div align="center">
					<span class="tabTitleSel">编辑仓库</span>
				</div>
			</td>
			<td width="50" background="images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="/AutoHome/servlet/UpdateWHServlet" method="post"
		onSubmit="return subUser()">
		<table class="maintable" width="100%" border="0" cellspacing="0">
			<tr>
				<td width="104">
					<div align="right">仓库ID：</div>
				</td>
				<td width="201" height="24"><input name="wID" type="text"
					class="inputcontent"  value="${whUp.wID}" size="20" maxlength="16" readonly="readonly"/></td>
				<td width="473" height="24"></td>
			</tr>

			<tr>
				<td width="104">
					<div align="right">仓库名称：</div>
				</td>
				<td height="24"><label></label><label> <input
						name="wName" type="text" class="inputcontent" id="text2"
						value="${whUp.wName}" size="20" maxlength="16" />
				</label></td>
				<td height="24"></td>
			</tr>


			<tr>
				<td width="104">
					<div align="right">仓库位置：</div>
				</td>
				<td height="24"><input name="wAddress" type="text"
					class="inputcontent"  value="${whUp.wAddress}" size="20"
					maxlength="16" /></td>
				<td height="24"></td>
			</tr>

			<tr>
				<td width="104">
					<div align="right">仓库储存量：</div>
				</td>
				<td height="24"><input name="wMax" type="text"
					class="inputcontent" id="text" value="${whUp.wMax}" size="20"
					maxlength="16" onblur="showTip()"/><span id="tip" style="display:none"><font color="red">存储量只能为整数</font></span></td>
				<td height="24"></td>
				<script type="text/javascript">
					function showTip() {
						if(isNaN($("#text").val())) {
							$("#tip").css("display","block");
						}else {
							$("#tip").css("display","none");
						}
					}
				</script>
			</tr>
			<tr>
				<td width="104">
					<div align="right">现有储存量：</div>
				</td>
				<td height="24"><input name="wExist" type="text"
					class="inputcontent" value="${whUp.wExist}" size="20" maxlength="16" onblur="showTip1()" id="text1"/><span id="tip1" style="display:none"><font color="red">存储量只能为整数</font></span></td>
				<td height="24"></td>
				<script type="text/javascript">
					function showTip1() {
						if(isNaN($("#text1").val())) {
							$("#tip1").css("display","block");
						}else {
							$("#tip1").css("display","none");
						}
					}
				</script>
			</tr>
		</table>
		<table align="right" width="100%">
			<tr>
				<td height="30" width="70"></td>
				<td width="65"><input type="submit" name="Submit" value="确定">
				</td>
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

	</form>
</body>
</html>
