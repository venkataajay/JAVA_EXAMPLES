package info.inetsolv;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Servlet;
public class FirstServlet implements Servlet 
{
	ServletConfig config;
	public void init(ServletConfig config)
	{
	System.out.println("this is init method");
	this.config=config;
	}
	public void service(ServletRequest request,ServletResponse rsponse)
	{
	System.out.println("this is service method");
	}
	public void destroy()
	{
	System.out.println("this is destroy method");
	}
	public ServletConfig getServletConfig()
	{
	System.out.println("this is getServletConfig method");
                  return config;
	}
	public String getServletInfo()
	{
	System.out.println("this is getServletInfo method");
                    return "this is my first Servlet";
	}
}
