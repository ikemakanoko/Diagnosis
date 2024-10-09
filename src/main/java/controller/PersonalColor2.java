package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonalDao;
import dao.PersonalDaoFactory;
import domain.Personal;

/**
 * Servlet implementation class PersonalColor2
 */
@WebServlet("/personalColor2")
public class PersonalColor2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonalDao dao = PersonalDaoFactory.createPersonalDao();
		try {
			List<Personal> List = dao.getAllpersonals();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/WEB-INF/view/personalColorChoice.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//jspに記載　question(設問)choice1～4(選択肢)result(結果)explanation(各パーソナルカラー別説明)
		//パラメータの取得
		String question = request.getParameter("question");
		String choice1 = request.getParameter("choice1");
		String choice2 = request.getParameter("choice2");
		String choice3 = request.getParameter("choice3");
		String choice4 = request.getParameter("choice4");
		String result = request.getParameter("result");
		String explanation = request.getParameter("explanation");
		
		System.out.println(question);
		System.out.println(choice1);
		System.out.println(choice2);
		System.out.println(choice3);
		System.out.println(choice4);
		System.out.println(result);
		System.out.println(explanation);
		
		
		
	}

}
