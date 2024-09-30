<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); // Proxies might cache without this header



 if(session.getAttribute("namey") == null){
	 

	    // Prevent caching
    
	 out.print(session.getAttribute("namey"));
	 response.sendRedirect("Login.html");
 }else{
	 out.println("ok");
 }


%>

Welcome ${namey} ....
<a href="logout?logout=${namey}">logout</a>

</body>
