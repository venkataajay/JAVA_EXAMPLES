package info.inetsolv;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
public class GrossServlet extends HttpServlet
{
   
   public void service(ServletRequest request,ServletResponse response) throws IOException,ServletException
	{
	   int id =Integer.parseInt(request.getParameter("empid"));
       Double bs=Double.parseDouble(request.getParameter("basic"));
	   double hra=bs*0.45;
	   double da=bs*0.35;
	   double ta=1200.0;
	   double bonus=3500.0;
	   double gs=bs+hra+da+ta+bonus;
	   System.out.println("Gross Salary:"+gs);
	   Double gsal=new Double(gs);
	   request.setAttribute("gross",gsal);
	   ServletContext application=getServletContext();
	   RequestDispatcher rd=application.getRequestDispatcher("/net");
	   rd.forward(request,response);
   
   
   }

}