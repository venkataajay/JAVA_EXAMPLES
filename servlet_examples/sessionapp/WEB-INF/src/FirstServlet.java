package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	  String usr=request.getParameter("uname");
	  HttpSession session=request.getSession();
	  session.setAttribute("sname",usr);
      PrintWriter out=response.getWriter();
	  response.setContentType("text/html");
	  out.println("hello"+usr+"welcome to my session");
      out.println("<html><body>");
	  out.println("<a href='http://localhost:3030/sessionapp/second'>next</a>");
	  out.println("</body></html>");
      	}
}