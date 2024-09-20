package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/siteTop")
public class SiteTopServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		Integer count = 0;
		ServletContext application = config.getServletContext();
		application.setAttribute("count", count);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/view/siteTop.jsp")
			.forward(request, response);
		ServletContext application = this.getServletContext();
		Integer count = (Integer)application.getAttribute("count");
		count++;
		application.setAttribute("count", count);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
	}
	
	public void destroy() {
	}

}