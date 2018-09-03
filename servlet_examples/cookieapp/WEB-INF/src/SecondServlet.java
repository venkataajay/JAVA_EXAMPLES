package info.inetsolv;
import javax.servlet.http.*;
import java.io.*;
public class SecondServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	   Cookie[] cks=request.getCookies();
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   out.println("hai"+cks[0].getValue()+"your password is"+cks[1].getValue());
	
	}
}