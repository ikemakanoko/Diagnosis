<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>MBTI診断</title>
<link rel="stylesheet" href="">

</head>
<body>
	<!-- 画像を表示させたい -->
	<img src="/Diagnosis/src/main/webapp/WEB-INF/view/images/capital_b.png"
		alt="">
	<h1>MBTI診断</h1>
	<p>二つの質問のうち、一つだけあなたの考え方にあてはまるものを選んでください。</p>
	<p>診断ボタンを押すと診断結果が表示されます。</p>
	<form action="" method="post">
		<h2>Q1</h2>
		<p>
			<input type="radio" name="questionEI" value="E" id="eI">
			<!--Eの質問  -->
			<label for="eI">大勢でいるほうが好きだ</label>
		</p>
		<p>
			<input type="radio" name="questionEI" value="I" id="Ie">
			<!--Iの質問 -->
			<label for="Ie">一人でいるほうが好きだ</label>
		</p>

		<h2>Q2</h2>
		<p>
			<input type="radio" name="questionSN" value="S" id="SN">
			<!-- Sの質問 -->
			<label for="SN">事実に基づいて物事を判断することが多い。「何が」「どうした」などを大切にする。現実主義である</label>
		</p>
		<p>
			<input type="radio" name="questionSN" value="N" id="NS">
			<!-- Nの質問 -->
			<label for="NS">想像力には自身がある。「かもしれない」という発想がたくさん出てくる。理想主義である。</label>
		</p>

		<h2>Q3</h2>
		<p>
			<input type="radio" name="questionTF" value="T" id="TF">
			<!-- Tの質問 -->
			<label for="TF">何かを解決したいとき合理的な完結さや、客観的な正しさを求める。感情は二の次である。</label>
		</p>
		<p>
			<input type="radio" name="questionTF" value="F" id="FT">
			<!--Fの質問  -->
			<label for="FT">他人の気持ちに敏感であり、結果より過程を重視するタイプである。価値観や倫理観を大切にする。</label>
		</p>

		<h2>Q4</h2>
		<p>
			<input type="radio" name="questionJP" value="J" id="JP">
			<!-- Jの質問 -->
			<label for="JP">計画性があり、決断力がある 秩序 几帳面 完璧に素早くこなす A型っぽいとよく言われる</label>
		</p>
		<p>
			<input type="radio" name="questionJP" value="P" id="PJ">
			<!-- Pの質問 -->
			<label for="PJ">協調性を重んじる、柔軟性がある マイペース 適応力が高い 意思決定より探求に幸せを感じる</label>
		</p>
		<br>
		<p>
			<a href=""><input type="submit" value="診断"></a>
		</p>
	</form>

	<h1>${result}</h1>
	<h2>診断結果</h2>
	<p>
		<a href="http://localhost:8080/Diagnosis/siteTop">サイトトップ</a>
	</p>


</body>
</html>