package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Daofactory;
import dao.PersonalDao;
import domain.Personal;

/**
 * Servlet implementation class PersonalColor2
 */
@WebServlet("/personalColor2")
public class PersonalColor2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Personal[] PersonalList = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonalDao dao = Daofactory.createPersonalDao();
			try {
				PersonalDao personalDao = Daofactory.createPersonalDao();
				List<Personal> PersonalList = personalDao.findAll();
				
				request.setAttribute("personalList", PersonalList);
				request.getRequestDispatcher("/WEB-INF/view/personalColorChoice.jsp")
						.forward(request, response);
			} catch (Exception e) {
				
			}
			
		request.getRequestDispatcher("/WEB-INF/view/personalColorChoice.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//jspに記載　question(設問)choice1～4(選択肢)result(結果)explanation(各パーソナルカラー別説明)
		//パラメータの取得
		String strId = request.getParameter("id"); 
		Integer id = Integer.parseInt(strId); 
		String question = request.getParameter("question");
		String choice1 = request.getParameter("choice1");
		String choice2 = request.getParameter("choice2");
		String choice3 = request.getParameter("choice3");
		String choice4 = request.getParameter("choice4");
		String result = request.getParameter("result");
		String explanation = request.getParameter("explanation");
		PersonalDao personalDao = Daofactory.createPersonalDao();
		try {
			List<Personal> personalList = personalDao.findAll();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		Personal personal_color;
		try {
			personal_color = personalDao.findById(id);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		request.setAttribute("id", id);
		request.setAttribute("choice1", choice1);
		request.setAttribute("choice2", choice2);
		request.setAttribute("choice3", choice3);
		request.setAttribute("choice4", choice4);
		request.setAttribute("question", question);
		request.setAttribute("result", result);
		request.setAttribute("explanation", explanation);
		
		for(Personal val : PersonalList) {
			if(val.getChoice().equals(id)) {
				result = val.getPersonal_color();
			}
			System.out.println(val.getChoice());
		}
		//choiceのうちどれか一つでも押したら次のquestionに遷移
		//questionのidは5、表の縦軸にパーソナルカラーのちがい横軸に質問の種類
		//反復で最後のquestionまで回す　最後まで回したら結果(result)と説明文(explanatoin)を出す　それが難しかったら、同じページの該当するパーソナルカラーの場所に移動する
		//完了画面の表示
		request.getRequestDispatcher("/WEB-INF/view/personalColorChoice.jsp")
				.forward(request, response);
	}
	}
