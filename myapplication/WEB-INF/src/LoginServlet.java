package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try{
		String user=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ajay","1234");
		Statement statement=connection.createStatement();
		String query="select * from users where uname='"+user+"'and upass='"+pass+"'";
		ResultSet resultSet=statement.executeQuery(query);
		if(resultSet.next())
		{
		    out.println("Hello "+user+"welcome to your account");
			HttpSession session=request.getSession();
			session.setAttribute("sname",user);
			response.sendRedirect("http://localhost:3030/myapplication/home.jsp");
		}
		else
		{
		    out.println("you are an invalid user");
		    request.getRequestDispatcher("/relogin.html").forward(request,response);
		}
		connection.close();
		}
		catch(SQLException sqle){
		    sqle.printStackTrace();
		}
		catch(IOException ioe){
		    ioe.printStackTrace();
		}
		catch(ServletException se){
		     se.printStackTrace();
		}
	}
}