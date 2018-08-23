<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>friendslist</title>
</head>
<body>
<%@ page import ="java.sql.*" %>
<%
String user=request.getParameter("userid"); 
session.putValue("userid",user); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajaydb",
"root","ajay1628"); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("select * from users where user='userid'"); 


%>
<a href ="Login.html">Login</a><br/><br/>
<a href="index.html">Home</a>
</body>
</html>