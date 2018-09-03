package info.inetsolv;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	   String usr=request.getParameter("uname");
	   String pwd=request.getParameter("upass");
	   Cookie ck1=new Cookie("cname",usr);
	   Cookie ck2=new Cookie("cpass",pwd);
	   System.out.println("cookie created");
	   response.addCookie(ck1);
	   response.addCookie(ck2);
       System.out.println("cookie added to the response");
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   out.println("hello"+usr);
	   out.println("<html>");
	   out.println("<body>");
	   out.println("<form action='http://localhost:3030/cookieapp/second'>");
	   out.println("<input type='submit' value='next'/>");
	   out.println("</form>");
	   out.println("</body>");
	   out.println("</html>");
	   System.out.println("cookie sent to the client");
	   }
}