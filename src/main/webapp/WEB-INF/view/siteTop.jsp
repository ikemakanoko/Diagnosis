<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>サイトのトップページ</title>
<link rel="stylesheet" href="">
</head>
<body>
	<header style="text-align: center">
		<h1>にゃんでも診断</h1>
		<img src="images/cat_yannnoka_step_cha.png"
		width="250" align="right">
		<img src="images/cat_yannnoka_step_cha.png"
		width="250" align="left">
		<br>
		<h2>いろんな診断ができます！</h2>
		<p>🐈あなたは${count}人目の訪問者です🐈</p>
		<br><br>
	</header>
	
	<br><br>
	<main>
		<h2>
			<a href="/Diagnosis/catDogStart">いぬねこどっち(test)</a>
		</h2>
			<p>いぬ派ですか？ねこ派ですか？</p>
			<img src="images/inuneko.jpg" width="250" align=""> <br>
		
		<h2>
			<a href="/Diagnosis/MbtiServlet">MBTI診断</a>
		</h2>
			<p>４問2択の選択肢を選んでいただくだけで簡易的なMBTI診断ができます</p>
			<img src="images/image.webp" width="250" align="">
			
		<h2>
			<a href="/Diagnosis/PersonalColorServlet">パーソナルカラー診断</a>
		</h2>
			<p>パーソナルカラーを診断できます。おすすめのコスメや服の色などがわかります。</p>
			<img src=
			"images/1629616293476-mrdpqQTTvJ.webp" width="250" align="">
		
		<h2>
			<a href="/Diagnosis/StasionStartServlet">山手線診断</a>
		</h2>
			<p>あなたを山手線の駅にたとえると何駅か診断します！</p>
			<img src=
			"images/5a1ca6844851a863007e6a984dbd4d00_t.jpeg" width="250" align=""> <br>
		
		<h3>
			<a href="/Diagnosis/RegisterServlet">会員登録</a>
		</h3>
		
		<h3>
			<a href="login">ログイン</a>
		</h3>
		<p>会員登録をしてログインすると回答を保存して後で見返すことができます。</p>
	</main>


	<footer> </footer>
</body>
</html>