<%@ page import="java.sql.*,javax.servlet.*" errorPage="error.jsp"%>
<%!
Connection con;
public void jspInit(){
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
System.out.println("connection established");
}
catch(SQLException sqle){
sqle.printStackTrace();
System.out.println("connection can not be established");
}
}
public void jspDestroy(){
try{
con.close();
}
catch(SQLException sqle){
sqle.printStackTrace();
System.out.println("connection can not be closed");
}
}
%>
<%
String user=request.getParameter("uname");
String pwd=request.getParameter("upass");
System.out.println("request recieved");
Statement st=con.createStatement();
String tbname=config.getInitParameter("tablename");
String query="select * from "+tbname+" where uname='"+user+"' and upass='"+pwd+"'";
System.out.println(query);
ResultSet rs=st.executeQuery(query);
if(rs.next()){
System.out.println("you are valid user");
session.setAttribute("uname",user);
response.sendRedirect("http://localhost:3030/loginapp/home.jsp");
}
else{
System.out.println("you are not a valid user");
application.getRequestDispatcher("/relogin.jsp").forward(request,response);
}
%>