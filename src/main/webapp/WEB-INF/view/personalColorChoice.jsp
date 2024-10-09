<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>回答選択</title>
<link rel="stylesheet" href="">

</head>
<body>
	<div style="text-align: center">
		<h1>${question}</h1>
		<form action="" method="post">
			<!-- 選択肢１画像も入れる -->
			<h2>
				<input type="button">${choice1}
			</h2>
			<!-- 選択肢２画像も入れる -->
			<h2>
				<input type="button">${choice2}
			</h2>
			<!-- 選択肢3画像も入れる -->
			<h2>
				<input type="button">${choice3}
			</h2>
			<!-- 選択肢4画像も入れる -->
			<h2>
				<input type="button">${choice4}
			</h2>
		</form>
		<h1>${result}</h1>
		<p>${explanation}</p>
		<h2>
			<a href="">おすすめアイテム</a>
		</h2>

		<h2>イエベ春の方におすすめのコスメ</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>
		<h2>イエベ春の方へのおすすめカラー</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>

		<h2>ブルべ夏の方におすすめのコスメ</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>
		<h2>ブルべ夏の方へのおすすめカラー</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>

		<h2>イエベ秋の方におすすめのコスメ</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>
		<h2>イエベ秋の方へのおすすめカラー</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>

		<h2>ブルべ冬の方におすすめのコスメ</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>
		<h2>ブルべ冬の方へのおすすめカラー</h2>
		<a href="">おすすめコスメ画像、押したら飛べるリンク</a>
		<p>
			<a href="http://localhost:8080/Diagnosis/siteTop">サイトトップ</a>
		</p>
	</div>
</body>
</html>