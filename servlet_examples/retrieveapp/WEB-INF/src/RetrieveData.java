package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class RetrieveData extends HttpServlet
{
   Connection con;
   public void init(ServletConfig config)
	{
   try
   {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	System.out.println("connection established");
   }
   catch (Exception e)
   {
	   e.printStackTrace();
   }
  }
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException
	{
       try
       {
		Statement st=con.createStatement();
		String query="select * from users";
		System.out.println(query);
		ResultSet rs=st.executeQuery(query);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		while(rs.next())
		   {
			out.println(rs.getString(uname)+"..."+rs.getString(upass));
			System.out.println((rs.getString(uname)+"..."+rs.getString(upass));
		   }
       }
       catch (SQLException sqle)
       { 
		   sqle.printStackTrace();
       }
	   catch (IOException ioe)
       { 
		   ioe.printStackTrace();
       }
    }
	public void destroy()
	{
	try
	{
		con.close();
	}
	catch (SQLException sqle)
	{
       sqle.printStackTrace();
	}
	
	}

}