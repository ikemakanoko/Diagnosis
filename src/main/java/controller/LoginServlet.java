package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Daofactory;
import dao.UserDao;
import domain.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/view/Login.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String loginId = request.getParameter("loginId");
			String loginPass = request.getParameter("loginPass");
			UserDao userDao = Daofactory.createUserDao();
			User user = userDao.findByLoginIdAndLoginPass(loginId, loginPass);
			if (user != null) {
				request.getSession().setAttribute("userName", user.getName());
				response.sendRedirect("siteTop");
			} else {
				request.setAttribute("error", true);
				request.getRequestDispatcher("/WEB-INF/view/Login.jsp")
						.forward(request, response);
			}
		} catch (Exception e) {
//			throw new ServletException(e);
		}
	}

}
