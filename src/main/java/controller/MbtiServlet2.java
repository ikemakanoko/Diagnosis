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
		String idValue = request.getParameter("id");
		String questionEIValue = request.getParameter("questionEI");
		String questionSNValue = request.getParameter("questionSN");
		String questionTFValue = request.getParameter("questionTF");
		String questionJPValue = request.getParameter("questionJP");

		MbtiDao mbtiDao = Daofactory.createMbtiDao();
		List<Mbti> mbtiList = mbtiDao.findAll();

		request.setAttribute("questionEI", questionEIValue);
		request.setAttribute("questionSN", questionSNValue);
		request.setAttribute("questionTF", questionTFValue);
		request.setAttribute("questionJP", questionJPValue);
		request.setAttribute("id", idValue);

		//アルファベットを順番に並べて表示
		String result = questionEIValue + questionSNValue + questionTFValue + questionJPValue;

		if (idValue == null) {
			result = "error";
		} else {
			for (Mbti val : mbtiList) {
				if (val.getChoice().equals(idValue)) {
					result = val.getMbti();
				}
				System.out.println(val.getChoice());
			}
		}
		request.setAttribute("result", result);
		//完了画面の表示
		request.getRequestDispatcher("/WEB-INF/view/mbti2.jsp").forward(request, response);
	}
}