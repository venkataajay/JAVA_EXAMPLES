package info.inetsolv;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class LogoutServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	  HttpSession session=request.getSession(false);
	  String user=(String) session.getAttribute("sname");
	  session.invalidate();
	  PrintWriter out=response.getWriter();
	  response.setContentType("text/html");
	  out.println("you are loggedout");
	  out.println("<html><body>");
	  out.println("<form action='/login.html'>");
	  out.println("click here to login again");
	  out.println("<input type='submit' value='login'>");
	  out.println("</form></body></html>");
	}
}