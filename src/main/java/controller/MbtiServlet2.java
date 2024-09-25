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

	//質問1から4　結果
	String[] question1List = { "E", "I" };
	String[] question2List = { "S", "N" };
	String[] question3List = { "T", "F" };
	String[] question4List = { "J", "P" };

	// 文字化け防止
	request.setCharacterEncoding("UTF-8");

	// フォームデータの取得
	String[] question1Values = request.getParameterValues("question1");
	String[] question2Values = request.getParameterValues("question2");
	String[] question3Values = request.getParameterValues("question3");
	String[] question4Values = request.getParameterValues("question4");

	// 回答結果を文字列データに変換
	String question1 = "";
	if (question1Values != null) {
		for (String question1Index : question1Values) {
			int i = Integer.parseInt(question1Index);
			if (i >= 0 && i < question1List.length) {
				question1 += question1List[i] + " ";
			}

		}

	String question2 = "";
	if (question2Values != null) {
		for (String question2Index : question2Values) {
			int i = Integer.parseInt(question2Index);
			if (i >= 0 && i < question2List.length) {
				question2 += question2List[i] + " ";
			}
		}
	String question3 = "";
	if (question3Values != null) {
		for (String question3Index : question3Values) {
			int i = Integer.parseInt(question3Index);
			if (i >= 0 && i < question3List.length) {
				question3 += question3List[i] + " ";
			}
		}
	String question4 = "";
	if (question4Values != null) {
		for (String question4Index : question4Values) {
			int i = Integer.parseInt(question4Index);
			if (i >= 0 && i < question4List.length) {
				question4 += question4List[i] + " ";
			}
		}
	}
	
	// メッセージの設定
	String message1 = question1.trim().equals("E") ? "E" : "I";
	String message2 = question2.trim().equals("S") ? "S" : "N"; // 修正
	String message3 = question3.trim().equals("T") ? "T" : "F"; // 修正
	String message4 = question4.trim().equals("J") ? "J" : "P"; // 修正

//				String question2 = "";
//				if(questiones2 != null) {
//					for(String question2Index : questiones2) {
//						int i = Integer.parseInt(question2Index);
//						question2 += question2List[i] + " ";
//					}
//				}
//				String question3 = "";
//				if(questiones3 != null) {
//					for(String question3Index : questiones3) {
//						int i = Integer.parseInt(question3Index);
//						question3 += question3List[i] + " ";
//					}
//				}
//				String question4 = "";
//				if(questiones4 != null) {
//					for(String question4Index : questiones4) {
//						int i = Integer.parseInt(question4Index);
//						question4 += question4List[i] + " ";
//					}
//				}
//				String message1;
//				if(question1 == "0") {
//					message1 ="E";
//				}
//				else {
//					message1 = "I";
//				}
//				String message2;
//				if(question2 == "2") {
//					message2 ="S";
//				}
//				else {
//					message2 = "F";
//				}
//				String message3;
//				if(question3 == "4") {
//					message3 ="T";
//				}
//				else {
//					message3 = "F";
//				}
//				String message4;
//				if(question4 == "6") {
//					message4 ="J";
//				}
//				else {
//					message4 = "P";
//				}

	// 完了画面に表示させる内容の準備
	request.setAttribute("question1", question1);
	request.setAttribute("question2", question2);
	request.setAttribute("question3", question3);
	request.setAttribute("question4", question4);
	request.setAttribute("message1", message1);
	request.setAttribute("message2", message2);
	request.setAttribute("message3", message3);
	request.setAttribute("message4", message4);
	System.out.println(message1);
	
	//アルファベットを順番に並べて表示
	String combinedMessage = message1 + message2 + message3 + message4;
	request.setAttribute("combinedMessage", combinedMessage);
	//request.setAttribute("message1 + message2 + message3 + message4", message1 + message2 + message3 + message4);

	//完了画面の表示
	request.getRequestDispatcher("/WEB-INF/view/mbti3.jsp")
	.forward(request, response);
	}

	}
}
}
}
