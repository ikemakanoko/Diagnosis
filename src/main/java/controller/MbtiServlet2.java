package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Daofactory;
import dao.MbtiDao;
import domain.Mbti;

/**
 * Servlet implementation class MbtiServlet3
 */
@WebServlet("/mbtiServlet2")
public class MbtiServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			//DAOによるデータ取得
			MbtiDao mbtiDao = Daofactory.createMbtiDao();
			List<Mbti> mbtiList = mbtiDao.findAll();
			request.setAttribute("mbti", mbtiList);
			//jspへフォワード
			request.getRequestDispatcher("/WEB-INF/view/mbti2.jsp")
					.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 文字化け防止
		request.setCharacterEncoding("UTF-8");

		// フォームデータの取得
		String qsEIValue = request.getParameter("questionEI");
		String qsSNValue = request.getParameter("questionSN");
		String qsTFValue = request.getParameter("questionTF");
		String qsJPValue = request.getParameter("questionJP");

		// エラーメッセージの変数を用意
		String errorMessage = null;

		// 入力チェック: nullまたは空文字かを確認
		if (qsEIValue == null || qsSNValue == null || qsTFValue == null || qsJPValue == null ||
				qsEIValue.isEmpty() || qsSNValue.isEmpty() || qsTFValue.isEmpty() || qsJPValue.isEmpty()) {
			errorMessage = "すべての質問に回答してください。";
		} else {
			// アルファベットを順番に並べて表示
			String result = qsEIValue + qsSNValue + qsTFValue + qsJPValue;
			request.setAttribute("result", result);
		}

		// エラーメッセージをリクエストにセット（メッセージがある場合のみ）
		if (errorMessage != null) {
			request.setAttribute("errorMessage", errorMessage);
		}

		// フォワード
		request.getRequestDispatcher("/WEB-INF/view/mbti2.jsp").forward(request, response);
	}
}
