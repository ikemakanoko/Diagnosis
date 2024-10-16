<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link rel="stylesheet" href="">
</head>
<body>
	<h1>サイト名</h1>
	<div style="text-align: center">

		<h1>ログイン</h1>

		<c:if test="${!empty error }">
			<div class="alert alert-danger" role="alert">
				ログインIDまたはパスワードが間違っています。</div>
		</c:if>


		<form action="" method="post">
			<div class="form-floating">
				<input type="text" name="loginId"
					class="form-control rounded-0 rounded-top" id="floatingInput"
					placeholder="ログインID"> <label for="floatingInput"></label>
			</div>

			<!-- 開発用にtext 公開時にはpasswordに変更 -->
			<div class="form-floating mb-3">
				<input type="password" name="loginPass"
					class="form-control border-top-0 rounded-0 rounded-bottom"
					id="floatingPassword" placeholder="パスワード"> <label
					for="floatingPassword"></label>
			</div>

			<input class="w-100 btn btn-lg btn-primary mb-3" type="submit"
				value="ログイン">

		</form>


		<p>会員登録をしていない方はこちら↓</p>
		<a href="register">新規会員登録</a>
		<p>会員登録をすると回答のデータを保存して後から見直すことができます</p>
		<p>
			<a href="siteTop">サイトトップ</a>
		</p>
	</div>

	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/jquery-3.6.0.min.js"></script>
</body>
</html>