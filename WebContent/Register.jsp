<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
 if(session.getAttribute("not_valid") != null){
	 out.print(session.getAttribute("not_valid"));
 }

if(session.getAttribute("userexist") !=null){
	out.print("user already exist");
}

%>
<form action="register" method="post">
Username:
<input type="text" name="username" id="username">
</br>
password
<input type="text" name="password" id="password">
<button >Sumbit </button>
</form>



</body>
</html>