<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script src="echarts.common.min.js"></script>
<script type="text/javascript" src="jquery-2.1.0.js"></script>
<script language="JavaScript" type="text/JavaScript">
	$(function() {
		$.ajax({
			url : "/AutoHome/servlet/TableServlet",
			dataType : "json",
			type : "post",
			success : function(data) {
				var dataArrA = new Array();
				var dataArrN = new Array();
				$.each(data, function(i, obj) {
					dataArrA[i] = obj.clAddress;
					dataArrN[i] = obj.clNum;
				});
				myChart.setOption({
					xAxis : {
						data : dataArrA
					},
					series : [ {
						name : '人数',
						data : dataArrN
					} ]
				});
			}
		});
	});
</script>
</head>
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
				<div align="center">客户统计</div>
			</td>
			<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
			<td background="../images/tab/bg.gif">&nbsp;</td>
		</tr>
	</table>
	<form action="listResume.do?page=1" method="post">
		<div id="show" style="width: 600px;height:400px;"></div>
		<script type="text/javascript">
			var myChart = echarts.init(document.getElementById('show'));
			myChart.setOption({
				title : {
					text : '客户统计表'
				},
				tooltip : {},
				legend : {
					data : [ '人数' ]
				},
				xAxis : {
					data : []
				},
				yAxis : {},
				series : [ {
					name : '人数',
					type : 'bar',
					data : []
				} ]
			});
		</script>
	</form>
</body>
</html>
