package info.inetsolv;
import javax.servlet.http.*;
import java.io.*;
public class SecondServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	String usr=request.getParameter("hname");
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	out.println("bye"+usr);
	}
}