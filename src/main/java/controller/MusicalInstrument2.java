package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MusicalInstument
 */
@WebServlet("/musicalInstument2")
public class MusicalInstrument2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/musicalinstrumentChoice.jsp")
				.forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け防止
		request.setCharacterEncoding("UTF-8");
		
		int resultcat = 1;
		int resultdog = 2;
		System.out.println(resultcat);
		System.out.println(resultdog);
	}

}
