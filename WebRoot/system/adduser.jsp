<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<title></title>
<body>
	<script language="javascript" src="js/ajax.js"></script>
	<table border="0" width="100%" cellspacing="0">
		<tr>
			<td background="images/topBarBg.gif" height="23">
				<div>
					<strong>系统管理∶添加新用户</strong>
				</div>
			</td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bordercolor="#6490C2">
		<tr>
			<td width="25" height="24" background="images/tab/firstLeftSel.gif">&nbsp;</td>
			<td width="100" background="images/tab/middleSel.gif"><div
					align="center">
					<span class="tabTitleSel">请填写内容</span>
				</div></td>
			<td width="50" background="images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="/AutoHome/servlet/AddUserServlet" method="post"
		onSubmit="return subUser()">
		<table class="maintable" width="100%" border="0" cellspacing="0">
			<tr>
				<td width="104"><div align="right">用户名：</div></td>
				<td width="201" height="24"><input name="uName" type="text"
					class="inputcontent" id="username" size="20" onblur="showTip()"> <span id="show" style="display:none"><font color="red">用户名已存在</font></span></td>
					<script type="text/javascript">
						function showTip() {
							var uName = $("#username").val();
							$.ajax({
								url:"/AutoHome/servlet/TestUserServlet",
								data:{uName:uName},
								dataType:"json",
								success:function(result) {
									if(result) {
										$("#show").css("display","block");
									}else{
										$("#show").css("display","none");
									}
								}
							});
							
						}
					</script>
				<td width="473"></td>
			</tr>
			<tr>
				<td width="104"><div align="right">用户密码：</div></td>
				<td height="24"><input name="uPwd" type="password"
					class="inputcontent" id="password" size="20" maxlength="16" /> <span
					class="star">*</span></td>
				<td height="24"></td>
			</tr>
			<tr>
				<td width="104"><div align="right">确认密码：</div></td>
				<td height="24"><input name="ensurePassword" type="password"
					class="inputcontent" id="ensurePassword" size="20" maxlength="16" />
					<span class="star" id="tip" style="display:none"><font color="red">输入密码不一致</font></span></td>
				<td height="24"></td>
			</tr>

			<tr>
				<td width="104"><div align="right">角色：</div></td>
				<td height="24" colspan="2"><select name="role" id="role"
					onmouseout="disAble()">
						<option selected="">--请选择--</option>
						<c:forEach items="${role}" var="role">
							<option value="${role.rID}">${role.rName}</option>
						</c:forEach>
				</select> <script type="text/javascript">
					function disAble() {
						var name = $("#username").val();
						var pwd = $("#password").val();
						var pwd1 = $("#ensurePassword").val();
						var sele = $("#role option:selected").text();
						if (pwd == pwd1 && pwd != "" && name != ""
								&& sele != "--请选择--") {
							$("#submit").attr('disabled', false);
							$("#tip").css("display", "none");
						} else {
							$("#tip").css("display", "block");
						}
					}
				</script> <span class="star">*</span></td>
			</tr>
		</table>
		<table align="right" width="100%">
			<tr>
				<td height="30" width="70"></td>
				<td width="65"><input type="submit" name="Submit" value="提交"
					id="submit" disabled="disabled"></td>
				<td width="96"><div align="center">
						<label> <input type="button" name="Submit" value="返回"
							onClick="history.back()">
						</label>
					</div></td>
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
