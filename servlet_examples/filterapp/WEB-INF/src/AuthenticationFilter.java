package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class AuthenticationFilter implements Filter
{
	ServletContext context;
	public void init(FilterConfig filterConfig)
	{
	   context=filterConfig.getServletContext();
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,ServletException
	{ 
		try{
	   String usr=request.getParameter("uname");
	   String pwd=request.getParameter("upass");
	   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   PreparedStatement pst=con.prepareStatement("select * from users(?,?)");
	   ResultSet rs=pst.executeQuery();
	   while(rs.next()){
	   rs.getString("uname");
	   rs.getString("upass");
	   }
	   if(usr.equals("uname")&&pwd.equals("upass"))
		{
	   chain.doFilter(request,response);
	   }
	   else
		{
	   context.getRequestDispatcher("/error.html").forward(request,response);
	   }
	   con.close();
		}
		
		catch(SQLException sqle){
		sqle.printStackTrace();
		}
	}
	   public void destory()
		{
	   
	   }
	  
}