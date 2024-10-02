package controller;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import dao.CatDogDao;
import dao.DaoFactory;

/**
 * Servlet implementation class MusicalInstument
 */
@WebServlet("/musicalInstument2")
public class MusicalInstrument2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/musicalinstrumentChoice.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//文字化け防止
		request.setCharacterEncoding("UTF-8");
		//ユーザーの入力情報の受け取り　getParameter
		String choice = request.getParameter("choice");
		String animal = request.getParameter("animal");

		try {
			//CatDogDaoオブジェクトの取得
			CatDogDao catDogDao = DaoFactory.createCatDogDao();

			//CatDogDaoオブジェクトの利用
			List<Member> catDogList = catDogDao.findAll();

			//DB接続、利用
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/diagnosis_db");
			Connection con = ds.getConnection();

			String sql = "SELECT * FROM animal_table WHERE choice = \"?\";";
			//データベースのデータを取り出すために使う　PreparedStatement
			PreparedStatement stmt = con.prepareStatement(sql);
			//特定のデータベースから情報を取得　executeQuery データベースからのデータの結果をまとめるResultset
			ResultSet rs = stmt.executeQuery();
			//取得をしないと結果に表示されない

			while (rs.next()) {
				int id = rs.getInt("id");
				//ユーザーの情報を一時的に保存　setAttribute
				request.setAttribute("id", id);
				request.setAttribute("animal", animal);
				request.setAttribute("choice", choice);

				//もし選んだ選択肢のidが１ならねこ２ならいぬ
				if (id == 1) {
					//データベースに新しいデータを追加するsetObject
					stmt.setObject(1, "?");//1番目の？に入る値
				} else if (id == 2) {
					stmt.setObject(2, "?");//2番目の？に入る値
				}
			}
		} catch (Exception e) {
			// 例外処理　サーブレット
			throw new ServletException(e);
		} finally {
			try {
			} catch (Exception e) {
				// 例外処理
			}
			//結果画面の表示
			request.getRequestDispatcher("/WEB-INF/view/musicalinstrumentResult.jsp")
					.forward(request, response);
		}
	}
}