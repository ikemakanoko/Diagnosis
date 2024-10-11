package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AnimalDaoFactory;
import dao.CatDogDao;
import domain.Catdog;

/**
 * Servlet implementation class MusicalInstument
 */
@WebServlet("/musicalInstument2")
public class MusicalInstrument2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			//DAOによるデータ取得
			CatDogDao catDogDao = AnimalDaoFactory.createCatDogDao();
			List<Catdog> catDogList = catDogDao.findAll();

			request.setAttribute("animal", catDogList);

			//jspへフォワード
			request.getRequestDispatcher("/WEB-INF/view/musicalinstrumentChoice.jsp")
					.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//文字化け防止
		request.setCharacterEncoding("UTF-8");

		// ユーザーの入力情報の受け取り
		String animal = request.getParameter("animal");
		String id = request.getParameter("id"); // ユーザーの選択を取得

		System.out.println(id);
		
		// DAOからデータ取得 一覧表示
		CatDogDao catDogDao = AnimalDaoFactory.createCatDogDao();
		List<Catdog> catDogList = catDogDao.findAll();
		
		if (id == null) {
			animal = "エラー";
		} else if (id.equals("Yes")) {
			animal = "ねこ";
		} else {
			animal = "いぬ";
		}
		// 結果をリクエストにセット
		request.setAttribute("animal", animal);

		// 結果画面の表示
		request.getRequestDispatcher("/WEB-INF/view/musicalinstrumentResult.jsp")
				.forward(request, response);
	}
}
