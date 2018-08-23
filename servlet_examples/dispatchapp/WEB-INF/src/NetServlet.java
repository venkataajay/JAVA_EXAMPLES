package info.inetsolv;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
public class NetServlet extends HttpServlet
{
      public void service(ServletRequest request,ServletResponse response) throws IOException
	{
	  int id =Integer.parseInt(request.getParameter("empid"));
	  Double bs=Double.parseDouble(request.getParameter("basic"));
	  Double gs=(Double)request.getAttribute("gross");
	  Double ns=gs-200-2000-100;
	  PrintWriter out=response.getWriter();
	  response.setContentType("text/html");
	  out.println("<html><body><center>");
	  out.println("empid"+id+"<br/>");
	  out.println("basic salary"+bs+"<br/>");
	  out.println("Gross salary:"+gs+"<br/>");
	  out.println("netSalary"+ns+"<br/>");
	  }


}