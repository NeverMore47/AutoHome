var xmlHttpReq;
//创建一个XmlHttpRequest对象
function createXmlHttpRequest()
{
	if(window.XMLHttpRequest)
	{
		xmlHttpReq = new XMLHttpRequest();
	}else
	{
		xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	}
}
//检测用户名是否已经被注册
function checkUser()
{
//首先创建精灵对象
createXmlHttpRequest();
//指明准备状态改变时回调的函数名
xmlHttpReq.onreadystatechange=handle;
//尝试以异步的get方式访问某个URL
var username = document.getElementById("username").value;
var url = "check?username="+username;
xmlHttpReq.open("get",url,true);
//向服务器发送请求
xmlHttpReq.send(null);
}
//状态发生改变时回调的函数
function handle()
{
//准备状态为4
	if(xmlHttpReq.readyState==4)
	{
	//响应状态码为200，代表一切正常
		if(xmlHttpReq.status==200)
		{
			var res = xmlHttpReq.responseText;
			var result = document.getElementById("test_username");
			result.style.display="";
			result.innerHTML = "<font color=red>"+res+"</font>";
		}
	}
}