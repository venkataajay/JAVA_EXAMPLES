package info.inetsolv;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;
import java.io.PrintWriter;
import java.io.IOException;
public class ReadServlet extends HttpServlet
{
   public void service(ServletRequest request,ServletResponse response) throws IOException
	{
        PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("sname");
		String rno=config.getInitParameter("srno");
        String marks=config.getInitParameter("smarks");
		out.println("name"+name+"<br/>");
		out.println("roll no"+rno+"<br/>");
		out.println("marks"+marks+"<br/>");
    }

}