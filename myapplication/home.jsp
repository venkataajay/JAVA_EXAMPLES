<%
out.println("welcome to MyApplication");
String user=(String) session.getAttribute("sname");
session.setMaxInactiveInterval(60);
%>
<html>
<body>
<form action="http://localhost:3030/myapplication/logout">
<input type="submit" value="logout">
</form>
</body>
</html>
