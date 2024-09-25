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
	String[] questionEIList = { "E", "I" };
	String[] questionSNList = { "S", "N" };
	String[] questionTFList = { "T", "F" };
	String[] questionJPList = { "J", "P" };

	// 文字化け防止
	request.setCharacterEncoding("UTF-8");

	// フォームデータの取得
	String[] questionEIValues = request.getParameterValues("questionEI");
	String[] questionSNValues = request.getParameterValues("questionSN");
	String[] questionTFValues = request.getParameterValues("questionTF");
	String[] questionJPValues = request.getParameterValues("questionJP");

	// 回答結果を文字列データに変換
	String questionEI = "";
	if (questionEIValues != null) {
		for (String questionEIIndex : questionEIValues) {
			int i = Integer.parseInt(questionEIIndex);
			if (i >= 0 && i < questionEIList.length) {
				questionEI += questionEIList[i] + " ";
			}
		}

	String questionSN = "";
	if (questionSNValues != null) {
		for (String questionSNIndex : questionSNValues) {
			int i = Integer.parseInt(questionSNIndex);
			if (i >= 0 && i < questionSNList.length) {
				questionSN += questionSNList[i] + " ";
			}
		}
	String questionTF = "";
	if (questionTFValues != null) {
		for (String questionTFIndex : questionTFValues) {
			int i = Integer.parseInt(questionTFIndex);
			if (i >= 0 && i < questionTFList.length) {
				questionTF += questionTFList[i] + " ";
			}
		}
	String questionJP = "";
	if (questionJPValues != null) {
		for (String questionJPIndex : questionJPValues) {
			int i = Integer.parseInt(questionJPIndex);
			if (i >= 0 && i < questionJPList.length) {
				questionJP += questionJPList[i] + " ";
			}
		}
	}
	
	// メッセージの設定
	String messageEI = questionEI.trim().equals("E") ? "E" : "I";
	String messageSN = questionSN.trim().equals("S") ? "S" : "N"; // 修正
	String messageTF = questionTF.trim().equals("T") ? "T" : "F"; // 修正
	String messageJP = questionJP.trim().equals("J") ? "J" : "P"; // 修正

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
	request.setAttribute("questionEI", questionEI);
	request.setAttribute("questionSN", questionSN);
	request.setAttribute("questionTF", questionTF);
	request.setAttribute("questionJP", questionJP);
	request.setAttribute("messageEI", messageEI);
	request.setAttribute("messageSN", messageSN);
	request.setAttribute("messageTF", messageTF);
	request.setAttribute("messageJP", messageJP);
	System.out.println(messageEI);
	
	//アルファベットを順番に並べて表示
	String combinedMessage = messageEI + messageSN + messageTF + messageJP;
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
