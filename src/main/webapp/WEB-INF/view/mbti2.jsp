<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>リスト型で回答MBTI</title>
<link rel="stylesheet" href="">

</head>
<body>
	<h1>MBTI診断</h1>
	<p>二つの質問のうち、一つだけあなたの考え方にあてはまるものを選んでください。</p>
	<p>診断ボタンを押すと診断結果が表示されます。</p>
	<form action="" method="post">
		<h2>Q1</h2>
		<p>
			<input type="radio" name="question1">Eの質問
			大勢で過ごしているほうが好きだ
		</p>
		<p>
			<input type="radio" name="question1">Iの質問
			一人でいるほうが好きだ
		</p>

		<h2>Q2</h2>
		<p>
			<input type="radio" name="question2">Sの質問 感覚
			安定性や信頼性を大事にする
		</p>
		<p>
			<input type="radio" name="question2">Nの質問 直感
			新しいアイデアを出すのは得意
		</p>

		<h2>Q3</h2>
		<p>
			<input type="radio" name="question3">Tの質問
			自分の軸を持っている
		</p>
		<p>
			<input type="radio" name="question3">Fの質問
			気づかいができる
		</p>

		<h2>Q4</h2>
		<p>
			<input type="radio" name="question4">Jの質問
			計画性があり、決断力がある
		</p>
		<p>
			<input type="radio" name="question4">Pの質問
			協調性を重んじる、柔軟性がある
		</p>
		<br>
		<p>
			<input type="submit" value="診断">
		</p>
	</form>
	
	<p>
		<a href="http://localhost:8080/Diagnosis/siteTop">サイトトップ</a>
	</p>
</body>
</html>