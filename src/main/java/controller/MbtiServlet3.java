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
@WebServlet("/MbtiServlet3")
public class MbtiServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//フォームの表示
		request.getRequestDispatcher("/WEB-INF/view/mbti3.jsp")
				.forward(request, response);
		
		//質問1から4
				String[] question1List = {"E", "I"};
				String[] question2List = {"S", "N"};
				String[] question3List = {"T", "F"};
				String[] question4List = {"J", "P"};
				
				// 文字化け防止
				request.setCharacterEncoding("UTF-8");
				
				String[] questiones1 = request.getParameterValues("question1");
				String[] questiones2 = request.getParameterValues("question2");
				String[] questiones3 = request.getParameterValues("question3");
				String[] questiones4 = request.getParameterValues("question4");
				
				String question1 = "";
				if(questiones1 != null) {
					for(String question1Index : questiones1) {
						int i = Integer.parseInt(question1Index);
						question1 += question1List[i] + " ";
					}
				}
				String question2 = "";
				if(questiones2 != null) {
					for(String question2Index : questiones2) {
						int i = Integer.parseInt(question2Index);
						question2 += question2List[i] + " ";
					}
				}
				String question3 = "";
				if(questiones3 != null) {
					for(String question3Index : questiones3) {
						int i = Integer.parseInt(question3Index);
						question3 += question3List[i] + " ";
					}
				}
				String question4 = "";
				if(questiones4 != null) {
					for(String question4Index : questiones4) {
						int i = Integer.parseInt(question4Index);
						question4 += question4List[i] + " ";
					}
				}


				request.setAttribute("question1", question1);
				request.setAttribute("question2", question2);
				request.setAttribute("question3", question3);
				request.setAttribute("question4", question4);
						
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/about.jsp")
				.forward(request, response);
	}

}
