package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.text.*;
public class RegisterServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try{
	    String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String uname=request.getParameter("uname");
		String upass=request.getParameter("pwd");
		String dob=request.getParameter("dob");
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ajay","1234");
		Statement st=con.createStatement();
		String query="insert into users values('"+fname+"','"+lname+"','"+uname+"','"+upass+"',"+dob+")";
		st.executeUpdate(query);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("registered successfully");
		out.println("<a href='login.html'>click here to Login");
		con.close();
		}
         catch(SQLException sqle){
		    sqle.printStackTrace();
		 }
		 catch(IOException ioe){
		    ioe.printStackTrace();
		 }
          
	}
}