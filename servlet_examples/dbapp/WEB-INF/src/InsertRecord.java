package info.inetsolv;
import java.sql.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.http.*;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class InsertRecord extends HttpServlet
{
     public void service(ServletRequest request,ServletResponse response)
	{
	 try
	 {
		int empid=Integer.parseInt(request.getParameter("empid"));
		String ename=request.getParameter("ename");
		String eaddress=request.getParameter("eaddress");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st=con.createStatement();
		String query="insert into emp values("+empid+",'"+ename+"','"+eaddress+"')";
		System.out.println(query);
        st.executeUpdate(query);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("record inserted");
		con.close();
	 }
	 catch (SQLException sqle)
	 {
		 sqle.printStackTrace();
	 }
	 catch (IOException ioe)
		{
	     ioe.printStackTrace();
	     }
     catch (NumberFormatException nfe)
		{
	      nfe.printStackTrace();
	     }
	 
	 }


}