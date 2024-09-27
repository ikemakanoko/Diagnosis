package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resultServlet")
public class MusicalinstrumentResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//次の画面に遷移
		request.getRequestDispatcher("/WEB-INF/view/musicalinstrumentResult.jsp")
				.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 文字化け防止
		request.setCharacterEncoding("UTF-8");
//		//DB接続、利用
//		InitialContext ctx;
//		try {
//		DataSource ds = (DataSource) ctx.lookup("java:com@/env/jsbc/diagnosis_db");
//		Connection con = ds.getConnection();
//
//		String sql = "SELECT animal FROM diagnosis_db.animal_table.(id, animal) WHERE (?,?)";
//		PreparedStatement stmt = con.prepareStatement(sql);
//
//		stmt.setObject(1, "ねこ");//1番目の？に入る値
//		stmt.setObject(2, "いぬ");//2番目の？に入る値
//
//		ResultSet rs = stmt.executeQuery();
//		while (rs.next()) {
//			int id = rs.getInt("id");
//			ctx = new InitialContext();
//		}
//		} catch (NamingException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
//			
			// フォームデータの取得
			String catdog = request.getParameter("animal");
			
			request.setAttribute("animal",catdog);
			
			String animal = catdog;
			
			request.setAttribute("animal", animal);
			request.getRequestDispatcher("/WEB-INF/view/musicalinstrumentResult.jsp")
			.forward(request, response);
		
		}

	}