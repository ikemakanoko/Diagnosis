package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

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

		try {
			//DB接続、利用
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:com@/env/jsbc/diagnosis_db");
			Connection con = ds.getConnection();

			String sql = "SELECT animal FROM diagnosis_db.animal_table.(id, animal) WHERE (?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);

			String animal = request.getParameter("animal");
			stmt.setObject(1, "ねこ");//1番目の？に入る値
			stmt.setObject(2, "いぬ");//2番目の？に入る値

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				
				// フォームデータの取得
				String catdog = request.getParameter("id");
				
				request.setAttribute("num",id);
				request.setAttribute("catdog",animal);
			}
		} catch (Exception e) {
			// 例外処理
			throw new ServletException(e);
		} finally {
			try {
			} catch (Exception e) {
				// 例外処理
			}

		}
	}

}
