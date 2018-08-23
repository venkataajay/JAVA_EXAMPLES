package info.inetsolv;
import javax.servlet.Servlet;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
public class WelcomeServlet extends GenericServlet
{
   public void service(ServletRequest request,ServletResponse response) throws IOException
	{
       PrintWriter out=response.getWriter();
	   //out.println("welcome to first servlet");
	   response.setContentType("text/html");
	   out.println("<html>");
	   out.println("<body>");
	   out.println("<center>");
	   out.println("<h1>");
	   out.println("<welcome to servlet>");
	   out.println("</h1>");
	   out.println("</center>");
	   out.println("</body>");
	   out.println("</html>");

   
    }


}