<%
String usr=request.getParameter("uname");
String pwd=request.getParameter("upass");
Cookie ck1=new Cookie("cname",usr);
Cookie ck2=new Cookie("cpass",pwd);
response.addCookie(ck1);
response.addCookie(ck2);
%>
<html>
	<body>
		<center>
			<form action="second.jsp">
			<input type="submit" value="second">
        </center>
	</body>
</html>