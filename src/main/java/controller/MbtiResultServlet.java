package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MbtiResultServlet
 */
@WebServlet("/mbtiResultServlet")
public class MbtiResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/mbtiResult.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String answer1 = request.getParameter("question");
		String answer2 = request.getParameter("questionSN");
		String answer3 = request.getParameter("questionTF");
		String answer4 = request.getParameter("questionJP");
		
		// INTJ 建築家　INTP 論理学者　ENTJ 指揮官　ENTP 討論者
		// INFJ 提唱者　INFP 仲介者　ENFJ 主人公　ENFP 運動家
		// ISTJ 管理者　ISFJ 擁護者　ESTJ 幹部　ESFJ 領事
		// ISTP 巨匠　ISFP 冒険家　ESTP 起業家　ESFP エンターテイナー
		// 上記の16タイプに分ける
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);
		
		
		
		request.getRequestDispatcher("/WEB-INF/view/mbtiResult.jsp")
		.forward(request, response);
	}

}
