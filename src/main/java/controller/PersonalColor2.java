package controller;

import java.io.IOException;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				PersonalDao personalDao = Daofactory.createPersonalDao();
				String question = personalDao.questionTitle();
				request.setAttribute("question", question);
				request.getRequestDispatcher("/WEB-INF/view/personalColorChoice.jsp")
						.forward(request, response);
			} catch (Exception e) {
				throw new ServletException(e);
			}
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
		
		PersonalDao personalDao = Daofactory.createPersonalDao();
		Personal personalColor = null;
		try {
			if (choice1 != null && !choice1.isEmpty()) {
				personalColor = personalDao.findByChoice("choice1");
	        } else if (choice2 != null && !choice2.isEmpty()) {
	            personalColor = personalDao.findByChoice("choice2");
	        } else if (choice3 != null && !choice3.isEmpty()) {
	            personalColor = personalDao.findByChoice("choice3");
	        } else if (choice4 != null && !choice4.isEmpty()) {
	            personalColor = personalDao.findByChoice("choice4");
	        }

	        // 結果が見つからなかった場合のエラーハンドリング
	        if (personalColor == null) {
	            request.setAttribute("error", "選択肢に対応する結果が見つかりませんでした");
	        } else {
	            // 結果をJSPに渡す
	            request.setAttribute("result", personalColor.getResult());
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        request.setAttribute("error", "データベース接続エラー");
	    }

	    // JSPにデータを設定してフォワード
	    request.setAttribute("question", question);
	    request.setAttribute("choice1", choice1);
	    request.setAttribute("choice2", choice2);
	    request.setAttribute("choice3", choice3);
	    request.setAttribute("choice4", choice4);

	    request.getRequestDispatcher("/WEB-INF/view/personalColorChoice.jsp").forward(request, response);
	}
}
		//choiceのうちどれか一つでも押したら次のquestionに遷移
		//questionのidは5、表の縦軸にパーソナルカラーのちがい横軸に質問の種類
		//反復で最後のquestionまで回す　最後まで回したら結果(result)と説明文(explanatoin)を出す　それが難しかったら、同じページの該当するパーソナルカラーの場所に移動する
		//完了画面の表示
		
		//choice１を押したら(クリック)resultにブルべ夏が出る(リクエスト処理で取得した値choice1)resultにDbの値を格納　id1の結果が出るようにする;
		//choice２を押したら(クリック)resultにブルべ冬が出る(リクエスト処理で取得した値choice2);
		//choice３を押したら(クリック)resultにイエベ秋が出る(リクエスト処理で取得した値choice3);
		//choice４を押したら(クリック)resultにイエベ春が出る(リクエスト処理で取得した値choice4);
