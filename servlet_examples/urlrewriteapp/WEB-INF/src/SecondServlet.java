package info.inetsolv;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SecondServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("sname");
		String pass=(String) session.getAttribute("spass");
		out.println("Hello"+name+ "your password is " +pass);
	} 
}