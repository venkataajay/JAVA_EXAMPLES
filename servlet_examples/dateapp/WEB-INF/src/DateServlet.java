package info.inetsolv;
import javax.servlet.Servlet;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
public class DateServlet extends GenericServlet 
{
   ServletConfig config;
   public void init(ServletConfig config)
	{
	   this.config=config;
	}
   public void service(ServletRequest request,ServletResponse response) throws IOException{
	   PrintWriter out=response.getWriter();
       java.util.Date d=new java.util.Date();
	   out.println("date is:"+d);
}
}