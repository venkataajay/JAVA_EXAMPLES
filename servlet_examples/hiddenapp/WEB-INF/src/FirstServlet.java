package info.inetsolv;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet 
{
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	 String usr=request.getParameter("uname");
	 PrintWriter out=response.getWriter();
	 response.setContentType("text/html");
	 out.println("hello"+usr);
	 out.println("<html>");
                   out.println("<body>") ;
                   out.println("<form action='http://localhost:3030/hiddenapp/second'>");
	 out.println("<input type='hidden' name='hname' value='"+usr+"'/>");
                   out.println("<input type='submit' value='second'>");
	 out.println("</form>");
                   out.println("</body>");
                   out.println("</html>");
	}

}
