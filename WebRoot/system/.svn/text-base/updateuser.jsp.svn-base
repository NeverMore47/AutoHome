<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<html>
<head>
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<link type="text/css" rel="stylesheet" href="../css/public.css">
</head>


<body>

	<table border="0" width="100%" cellspacing="0">
		<tr>
			<td background="images/topBarBg.gif" height="23"><strong>
					<div class="searchfontlist">系统管理∶修改用户</div>
			</strong></td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bordercolor="#6490C2">
		<tr>
			<td width="25" height="24" background="images/tab/firstLeftSel.gif">&nbsp;

			</td>
			<td width="100" background="images/tab/middleSel.gif"></td>
			<td width="50" background="images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="/AutoHome/servlet/UpdateUserServlet" method="post"
		onSubmit="return subUser()">
		<table class="maintable" width="100%" border="0" cellspacing="0">
			<tr>
				<td width="104">
					<div align="right">用户名：</div>
				</td>
				<td width="201" height="24"><input name="username" type="text"
					value="${userUp.uName }" class="inputcontent" id="username"
					size="20" readonly="true"></td>
				<td width="473"></td>
			</tr>
			<tr>
				<td width="104">
					<div align="right">新密码：</div>
				</td>
				<td height="24"><input name="password" type="password"
					class="inputcontent" id="password" value="" size="20"
					maxlength="16" /> <span class="star">*</span></td>
				<td height="24"></td>
			</tr>
			<tr>
				<td width="104">
					<div align="right">确认密码：</div>
				</td>
				<td height="24"><input name="ensurePassword" type="password"
					class="inputcontent" id="ensurePassword" value="" size="20"
					maxlength="16" onBlur="disAble()" /> <span class="star" id="tip" style="display:none"><font color="red">输入密码不一致</font></span></td>
				<td height="24"></td>
			</tr>
			<script type="text/javascript">
				function disAble() {
					var pwd = $("#password").val();
					var pwd1 = $("#ensurePassword").val();
					if(pwd == pwd1 && pwd != "") {
						$("#submit").attr('disabled',false); 
						$("#tip").css("display","none");
					}else{
						$("#tip").css("display","block");
					}
				}
			</script>
		
			<tr>
				<td width="104">
					<div align="right">角色：</div>
				</td>
				<td height="24" colspan="2"><select name="role" id="role">
						<option selected>--请选择--</option>
						<c:forEach items="${role }" var="role">
							<option value="${role.rID }">${role.rName }</option>
						</c:forEach>
				</select> <span class="star">*</span></td>

			</tr>
		</table>
		<table align="right" width="100%">
			<tr>
				<td height="30" width="70"></td>
				<td width="65"><input type="submit" name="Submit" value="确定"
					disabled="disabled" id="submit"> <script
						type="text/javascript">
				</script></td>

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
