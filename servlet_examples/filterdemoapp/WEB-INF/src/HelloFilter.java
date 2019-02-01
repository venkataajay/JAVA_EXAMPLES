package info.inetsolv;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class HelloFilter implements Filter
{
	public void init(FilterConfig filterConfig)
	 {
	
	 }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,ServletException
	{
	    response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("before processing the request");
		chain.doFilter(request,response);
	    System.out.println("after processing the request");
     }
	public void destroy()
	{
	
	}
}