<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script language="JavaScript" type="text/JavaScript">

</script>
</head>
<script src="echarts.common.min.js"></script>
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<script language="javascript" type="text/javascript">
	
</script>
<body>
	<table class="maintable" border="0" width="100%" cellspacing="0">
		<tr>
			<td background="../images/topBarBg.gif">统计管理</td>
			<td width="20" height="23" background="../images/topBarBg.gif">
				<div align="right">
					<a href="#"><img src="../images/iHelp.gif" width="16"
						height="16" border="0"></a>
				</div>
			</td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bordercolor="#6490C2">
		<tr>
			<td width="25" height="24"
				background="../images/tab/firstLeftSel.gif">&nbsp;</td>
			<td width="100" background="../images/tab/middleSel.gif">
				<div align="center">库存统计</div>
			</td>
			<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="../images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="listResume.do?page=1" method="post">
		<p>
			<label> <select name="select" id="select">
					<option>--请选择--</option>
					<c:forEach items="${whInfo}" var="wh">
						<option value="${wh.wID}">${wh.wName}</option>
					</c:forEach>
			</select>
			</label> <label> <input type="button" name="Submit" value="查看"
				onclick="showTab()"> <script type="text/javascript">
					function showTab() {
						var wID = $("#select").val();
						$.ajax({
							url : "/AutoHome/servlet/TableServlet",
							data : {
								wID : wID
							},
							dataType : "json",
							success : function(data) {
								var dataStr = "[";
								$.each(data, function(i, obj) {
									dataStr += "{\"value\":\"" + obj.cQuantity
											+ "\",\"name\":\"" + obj.cName + "\"},";
								});
								dataStr=dataStr.substring(0,dataStr.length-1);
								dataStr+="]";
								myChart.setOption({
									series : [ {
										data : $.parseJSON(dataStr)
									} ]
								});
								$("#title").html($("#select").find("option:selected").text());
							}
						});
					}
				</script>
			</label>
		</p>
		<div style="margin-left:250px"><h1  id="title"></h1></div>
		<div id="show" style="width: 600px;height:400px;">
			
		</div>
		<script type="text/javascript">
			var myChart = echarts.init(document.getElementById("show"));
			myChart.setOption({
				series : [ {
					name : '库存统计',
					type : 'pie',
					radius : '55%',
					data : []
				} ]
			});
		</script>
	</form>
</body>
</html>
