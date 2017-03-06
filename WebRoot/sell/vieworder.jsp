<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
	<head>
		<meta
			http-equiv="Content-Type"
			content="text/html; charset=UTF-8" />
		<title></title>
		<link
			type="text/css"
			rel="stylesheet"
			href="../css/public.css">
		<link
			rel="stylesheet"
			type="text/css"
			href="css/birthday.css">
		<script
			language="javascript"
			type="text/javascript"
			src="../js/birthday.js"></script>
		<script
			language="JavaScript"
			type="text/JavaScript">

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
		<form
			name="listform"
			action="SellAddAction.do"
			method="post"
			>
			<table
				border="0"
				width="100%"
				cellspacing="0">
				<tr>
					<td
						background="../images/topBarBg.gif"
						height="23">
						訂單詳情
					</td>
				</tr>
			</table>
			<table
				width="100%"
				border="0"
				cellpadding="0"
				cellspacing="0"
				bordercolor="#6490C2">
				<tr>
					<td
						width="25"
						height="24"
						background="../images/tab/firstLeftSel.gif">
						&nbsp;
					</td>
					<td
						width="100"
						background="../images/tab/middleSel.gif">
						<div align="center">
							<span class="tabTitleSel">確認訂單</span>
						</div>
					</td>
					<td
						width="50"
						background="../images/tab/lastRightSel.gif">
						&nbsp;
					</td>
					<td background="../images/tab/bg.gif">
						&nbsp;
					</td>
				</tr>
			</table>

			<table
				class="maintable"
				width="97%"
				border="0"
				cellspacing="0">

	

				<tr>
					<td width="14%">
						<div align="center">
							订单号
						</div>
					</td>
					<td width="23%">
						<input
							name="s_id"
							type="text"
							id="names"
							value="">
						*
						<div
							id="test_names"
							style="display:none ">
							请填写订单号
						</div>
					</td>
					<td width="15%">
						<div align="center">
							客户号
						</div>
					</td>
					<td width="48%">
						<input
							name="ss_id"
							type="text"
							id="otherLink"
							value="">
					</td>
				</tr>
				<tr>
					<td>
						<div align="center">
							车编号
						</div>
					</td>
					<td>
						<input
							name="car_id"
							type="text"
							id="linkPhone"
							value="">
					</td>
					<td>
						<div align="center">
							车名称
						</div>
					</td>
					<td>
						<input
							name="car_name"
							type="text"
							id="age"
							value="">
					</td>
				</tr>
				<tr>
					<td>
						<div align="center">
							车流向
						</div>
					</td>
					<td>
						<input
							name="car_c"
							type="text"
							id="specialty"
							value="">
					</td>
					<td>
						<div align="center">
							车类型
						</div>
					</td>
					<td>
						<input
							name="car_type"
							type="text"
							id="school"
							value="">
					</td>
				</tr>
				<tr>
					<td>
						<div align="center">
							成交价
						</div>
					</td>
					<td>
						<input
							name="car_money"
							type="text"
							id="school"
							value="">
					</td>
					<td>
						<div align="center">
							销售日期
						</div>
					</td>
					<td>
						<input
							name="data"
							type="text"
							id="mailingTime"
							onClick="show_cele_date(this,'','',this)"
							value="">
					</td>
				</tr>
				<tr
					align="center"
					bgcolor="#99CCFF">
					<td
						height="26"
						colspan="4"
						class="titleLine">
						<div align="left">
							订单说明：
							<span class="style2"></span>
						</div>
					</td>
				</tr>
				<tr>
					<td
						height="121"
						colspan="4"
						align="center">
						<textarea
							name="text"
							id="texts"
							cols="140"
							rows="5"></textarea>
					</td>
				</tr>
			</table>

			<table
				align="left"
				width="100%">
				<tr>
					<td height="107">
						<div align="center">
							<input
								type="submit"
								name="Submit"
								value="提交">
							<input
								type="reset"
								value="重置">


							<input
								type="button"
								value="返回"
								onClick="history.back()">
						</div>
					</td>
				</tr>
				<tr>
					<td
						height="30"
						background="../images/tab/bg.gif"></td>
				</tr>
			</table>
		</form>
	</body>
</html>
