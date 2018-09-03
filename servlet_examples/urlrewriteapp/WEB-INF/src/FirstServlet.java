package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	   String usr=request.getParameter("uname");
	   String pwd=request.getParameter("upass");
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   HttpSession session=request.getSession();
	   session.setAttribute("sname",usr);
	   session.setAttribute("spass",pwd);
	   out.println("<html><body><center>");
	   out.println("<form action='"+response.encodeURL("http://localhost:3030/urlrewriteapp/second")+"'>");
	   out.println("</form>");
	   out.println("</center></body></html>");
	   }
}