<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>回答選択</title>
<link rel="stylesheet" href="css/Personal.css">

</head>
<body>
	<div style="text-align: center">
		<h1>${question}</h1>
		<form action="" method="post">
			<!-- 選択肢１画像も入れる -->
			<div class="box1">
					<input type="submit" name="choice1" value="choice1">
			</div>
			<!-- 選択肢２画像も入れる -->
			<div class="box2">
					<input type="submit" name="choice2" value="choice2">
			</div>
			<!-- 選択肢3画像も入れる -->
			
			<div class="box3">
					<input type="submit" name="choice3" value="choice3">
			</div>
			
			<!-- 選択肢4画像も入れる -->
			<div class="box4">
					<input type="submit" name="choice4" value="choice4">
			</div>
		</form>

		<h1>${result}</h1>
		<p>${explanation}</p>
		<br> <br> <br> <br> <br> <br>
		<h1>おすすめアイテム</h1>

		<h2>イエベ春の方におすすめのコスメ</h2>
		<a
			href="https://www.amazon.co.jp/rom-%E3%83%AD%E3%83%A0%E3%82%A2%E3%83%B3%E3%83%89-%E3%80%90%E6%AD%A3%E8%A6%8F%E5%93%81%E3%80%91%E3%83%99%E3%82%BF%E3%83%BC%E3%82%B6%E3%83%B3%E3%82%A2%E3%82%A4%E3%82%BA-03%E3%83%89%E3%83%A9%E3%82%A4%E3%83%A9%E3%82%B0%E3%83%A9%E3%82%B9-%E3%82%A2%E3%82%A4%E3%82%B7%E3%83%A3%E3%83%89%E3%82%A6/dp/B086TCBSP9?th=1">
			<img src="images/51nzvjfAOKL._AC_SX466_.jpg" style="width: 190px">
		</a>
		<p>rom&nd(ロムアンド)ベターザンアイズ #03ドライラグラス アイシャドウ</p>
		<h2>イエベ春の方へのおすすめカラー</h2>
		<img
			src="images/6063545b3135e21a0c95a4f9_vnY2tUqaisBBgM7piazfyaCZ6bJzHD36HpnPsG4LF9FScqO6fVe3iQGwpPKKfgYlG3RAaW02OXpUU7cdUbPZGif3GFSWbmsyIlJMBHqPKik28BuIiAUzvFEPfmXNQVC1Wvzp90Cf.png"
			style="width: 300px"> <br> <br> <br> <br> <br>
		<br>

		<h2>ブルべ夏の方におすすめのコスメ</h2>
		<a
			href="https://www.amazon.co.jp/excel-%E3%82%A8%E3%82%AF%E3%82%BB%E3%83%AB-%E3%83%AA%E3%82%A2%E3%83%AB%E3%82%AF%E3%83%AD%E3%83%BC%E3%82%BA%E3%82%B7%E3%83%A3%E3%83%89%E3%82%A6CS04-%E3%83%97%E3%83%A9%E3%83%A0%E3%83%8B%E3%83%83%E3%83%88/dp/B07GHTW2T9">
			<img src="images/916ky2NTv2L._AC_SX466_.jpg" style="width: 190px">
		</a>
		<p>excel(エクセル)リアルクローズシャドウCS04 プラムニット</p>
		<h2>ブルべ夏の方へのおすすめカラー</h2>
		<img
			src="images/606356e9ef33ed62c88a36c8_bgFa1ZO-gLi7YNxy8528oNqxMT8NjErtph0IYqXx5lXV8jV5-uMXw7QMdMech0NSDPTo0NiQnI1W3QSc_lM0DtjyQ-qcSwK7zVXcWaHjzihj5N-208RZm97TgJLlAqo3KYjhN2YF.png"
			style="width: 300px"> <br> <br> <br> <br> <br>
		<br>

		<h2>イエベ秋の方におすすめのコスメ</h2>
		<a
			href="https://www.amazon.co.jp/%E3%83%AC%E3%83%96%E3%83%AD%E3%83%B3-%E3%82%A2%E3%82%A4%E3%82%B7%E3%83%A3%E3%83%89%E3%82%A6-%E3%82%AF%E3%82%A2%E3%83%83%E3%83%89-%E3%82%B4%E3%83%BC%E3%83%AB%E3%83%87%E3%83%B3-%E3%82%AB%E3%83%A9%E3%83%BC%E3%82%A4%E3%83%A1%E3%83%BC%E3%82%B8/dp/B0D95LWMX2">
			<img src="images/61Sf5aZFB1L._AC_SY450_.jpg" style="width: 190px">
		</a>
		<p>REVLON(レブロン)ダズル アイシャドウ クアッド 009 ゴールデンアンバー</p>
		<h2>イエベ秋の方へのおすすめカラー</h2>
		<img
			src="images/606355bc69291e9848b4fc16_j6UBi-xkksER1bHp_cc3BzQ2CiiTMZe087eFZnikK2KB4JHsPJ3zSLbqC6AVTKOyCn_NP6aKdtDh_Fq2xVb_cQTvmtPVs9mC7QLkn-1lkAWfF709pIqtbZhRX18uHt0t--8RhhEM.png"
			style="width: 300px"> <br> <br> <br> <br> <br>
		<br>

		<h2>ブルべ冬の方におすすめのコスメ</h2>
		<a
			href="https://www.amazon.co.jp/excel-%E3%82%A8%E3%82%AF%E3%82%BB%E3%83%AB-%E3%82%B9%E3%82%AD%E3%83%8B%E3%83%BC%E3%83%AA%E3%83%83%E3%83%81%E3%82%B7%E3%83%A3%E3%83%89%E3%82%A6-%E3%83%94%E3%82%AA%E3%83%8B%E3%83%BC%E3%83%96%E3%83%A9%E3%82%A6%E3%83%B3-%E3%82%A2%E3%82%A4%E3%82%B7%E3%83%A3%E3%83%89%E3%82%A6/dp/B0831SNY6Z">
			<img src="images/71nKfbE1YbL.__AC_SX300_SY300_QL70_ML2_.jpg"
			style="width: 190px">
		</a>
		<p>excel スキニーリッチシャドウ SR10 ピオニーブラウン</p>
		<h2>ブルべ冬の方へのおすすめカラー</h2>
		<img src="images/ダウンロード.png" style="width: 300px"> <br> <br>
		<br>

		<noscript>
			<h1>JavaScriptを有効にしてください。</h1>
		</noscript>
		<p>
			<a href="http://localhost:8080/Diagnosis/siteTop">サイトトップ</a>
		</p>
		<!-- 外部Jsファイルの読み込み -->
		<script src="js/personalScript.js"></script>
	</div>
</body>
</html>