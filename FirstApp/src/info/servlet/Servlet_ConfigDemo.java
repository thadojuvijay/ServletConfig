package info.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/first" }, 
		initParams = { 
				@WebInitParam(name = "sno", value = "5896"), 
				@WebInitParam(name = "sname", value = "vijay")
		})
public class Servlet_ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletConfig config=getServletConfig();
		String id = config.getInitParameter("sno");	
		String	name = config.getInitParameter("sname");
		//response.setContentType("html/text");
	PrintWriter out = response.getWriter();
	out.println(id);
	out.println(name);
	}

}
