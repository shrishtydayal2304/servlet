<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body
{
background-color:cyan;}
</style>
</head>
<body>
<%	
response.setHeader("Cache-control","no-cache,no-store,must-revalidate"); //HTTP 1.1
if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}
%>
<h2>Welcome here!</h2><br>
here is the <a href= "https://youtu.be/I297fWlMDx0">video</a><br>
Link to:<a href= "https://www.linkedin.com/in/shrishty-dayal-59089816a/">My linkedln</a><br>
Link to:<a  href= "https://github.com/shrishtydayal2304">My github</a>
</body>
</html>