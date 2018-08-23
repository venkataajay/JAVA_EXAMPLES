package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class FirstServlet extends HttpServlet
{
    public void service(ServletRequest request,ServletResponse response) throws IOException
	{
	    PrintWriter out=response.getWriter();
		response.setContentType("text/html");
        ServletContext application=getServletContext();
		String driver=application.getInitParameter("driver");
		String url=application.getInitParameter("url");
		String usr=application.getInitParameter("usr");
		String pwd=application.getInitParameter("pwd");
		//out.println("DriverName:"+driver+"<br/>");
		//out.println("URL"+url+"<br/>");
		//out.println("username"+usr+"<br/>");
		//out.println("password"+pwd+"<br/>");
		try
		{
			int empid=Integer.parseInt(request.getParameter("empid"));
			String ename=request.getParameter("ename");
			String eaddress=request.getParameter("eaddress");
		    Class.forName("driver");
			Connection con=DriverManager.getConnection("url","usr","pwd");
			Statement st=con.createStatement();
			String query="insert into emp values("+empid+",'"+ename+"','"+eaddress+"')";
			System.out.println(query);
			st.executeUpdate(query);
			out.println("record is inserted");
			con.close();
         }
		catch (SQLException sqe)
		{
			sqe.printStackTrace();
		}
		
			catch(ClassNotFoundException cnf)
		{
			cnf.printStackTrace();
			
		}
		 catch (NumberFormatException nfe)
		{
	      nfe.printStackTrace();
         }
}
}