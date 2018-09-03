<%String usr=request.getParameter("uname")
out.println("hello"+usr );
%>
<html>
<body>
<form action="second.jsp">
<input type="hidden" name="hname" value='"+usr+"'/>
<input type="submit" value="second">
</form>
</body>
</html>
