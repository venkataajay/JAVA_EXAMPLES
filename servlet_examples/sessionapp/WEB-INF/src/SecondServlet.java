package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SecondServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	HttpSession session=request.getSession();
	String str=(String) session.getAttribute("sname");
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	out.println("hello"+str);
	}
}