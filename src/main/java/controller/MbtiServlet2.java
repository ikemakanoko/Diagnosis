package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MbtiServlet3
 */
@WebServlet("/mbtiServlet2")
public class MbtiServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//フォームの表示
		request.getRequestDispatcher("/WEB-INF/view/mbti2.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	// 文字化け防止
	request.setCharacterEncoding("UTF-8");

	// フォームデータの取得
	String questionEIValue = request.getParameter("questionEI");
	String questionSNValue = request.getParameter("questionSN");
	String questionTFValue = request.getParameter("questionTF");
	String questionJPValue = request.getParameter("questionJP");

	request.setAttribute("questionEI", questionEIValue);
	request.setAttribute("questionSN", questionSNValue);
	request.setAttribute("questionTF", questionTFValue);
	request.setAttribute("questionJP", questionJPValue);
	//アルファベットを順番に並べて表示
	String  result = questionEIValue + questionSNValue + questionTFValue + questionJPValue; 
	request.setAttribute("result", result);

	//完了画面の表示
	request.getRequestDispatcher("/WEB-INF/view/mbti2.jsp")
	.forward(request, response);
}
}

