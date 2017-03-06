function subUser()
{
	var username = document.getElementById("username");
	var test_username = document.getElementById("test_username");
	var password = document.getElementById("password");
	var test_password = document.getElementById("test_password");
	var ensurePassword = document.getElementById("ensurePassword");
	var test_ensurePassword = document.getElementById("test_ensurePassword");
	var name = document.getElementById("name");
	var test_name = document.getElementById("test_name");
	
	test_username.style.display = "none";
	test_password.style.display = "none";
	test_ensurePassword.style.display = "none";
	test_name.style.display = "none";

    var returnInfo;
 	if(username.value == "")
	{
		test_username.style.display = "block";
//		username.focus();
		returnInfo = false;
	}
	if(password.value.length < 6)
	{
		test_password.style.display = "block";
		password.value = "";
//		password.focus();
		returnInfo = false;
	}
	if(ensurePassword.value != password.value)
	{
		test_ensurePassword.style.display = "block";
		ensurePassword.value = "";
//		ensurePassword.focus();
		returnInfo = false;
	}
	if(name.value == "")
	{
		test_name.style.display = "block";
		name.value = "";
//		name.focus();
		returnInfo = false;
	}
	return returnInfo;
}

function subRole()
{
	var roleName = document.getElementById("roleName");
	var test_roleName = document.getElementById("test_roleName");
	var roleDepict = document.getElementById("roleDepict");
	var test_roleDepict = document.getElementById("test_roleDepict");
	
	test_roleName.style.display = "none";
	test_roleDepict.style.display = "none";
	
	var returnInfo;
 	if(roleName.value == "")
	{
		test_roleName.style.display = "block";
		returnInfo = false;
	}
	if(roleDepict.value == "")
	{
		test_roleDepict.style.display = "block";
		returnInfo = false;
	}
	return returnInfo;
}

function subPur()
{
	var addPur = document.getElementById("addPur"); 
	if(addPur.value == "")
	{
		alert("²»ÄÜÎª¿Õ");
		return false;
	}
}
