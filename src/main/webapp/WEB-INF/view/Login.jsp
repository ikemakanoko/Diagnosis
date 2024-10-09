<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="">
</head>
<body>
	<h1>サイト名</h1>
	<div style="text-align: center">
		<h1>ログイン</h1>

		<c:if test="${!empty error }">
			<p>
				<c:out value="${error }" />
			</p>
		</c:if>

		<form action="" method="post">
			<p>
				ログインID： <input type="text" name="loginid">
			</p>

			<!-- 開発用にtext 公開時にはpasswordに変更 -->
			<p>
				パスワード：<input type="text" name="loginpass">
			</p>

			<p>
				<input type="submit" value="ログイン">
			</p>

		</form>


		<p>会員登録をしていない方はこちら↓</p>
		<a href="register">新規会員登録</a>
		<p>会員登録をすると回答のデータを保存して後から見直すことができます</p>
		<p>
			<a href="http://localhost:8080/Diagnosis/siteTop">サイトトップ</a>
		</p>
	</div>

	<script></script>
</body>
</html>