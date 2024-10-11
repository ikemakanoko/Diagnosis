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
		<h2>おすすめアイテム</h2>

		<h2>イエベ春の方におすすめのコスメ</h2>
		<a href="https://www.amazon.co.jp/rom-%E3%83%AD%E3%83%A0%E3%82%A2%E3%83%B3%E3%83%89-%E3%80%90%E6%AD%A3%E8%A6%8F%E5%93%81%E3%80%91%E3%83%99%E3%82%BF%E3%83%BC%E3%82%B6%E3%83%B3%E3%82%A2%E3%82%A4%E3%82%BA-03%E3%83%89%E3%83%A9%E3%82%A4%E3%83%A9%E3%82%B0%E3%83%A9%E3%82%B9-%E3%82%A2%E3%82%A4%E3%82%B7%E3%83%A3%E3%83%89%E3%82%A6/dp/B086TCBSP9?th=1">こちら</a>
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