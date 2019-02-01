package info.inetsolv;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class HelloServlet extends HttpServlet
{
	public void service(ServletRequest request, ServletResponse response) throws IOException
	{
	   String str=request.getParameter("uname");
	   PrintWriter out=response.getWriter();
	   response.setContentType("ext/html");
	   out.println("welcome   "+str);
	}
}