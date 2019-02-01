package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class WelcomeServlet extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
       String user=request.getParameter("uname");
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   out.println("hello " +user+ " welcome to servlet" );
   
    }

}