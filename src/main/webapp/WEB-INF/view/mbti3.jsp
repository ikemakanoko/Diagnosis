<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>診断結果</title>
 <link rel="stylesheet" href="">

</head>
<body>
<h1>診断結果</h1>
<h2>結果</h2>
	<%= request.getAttribute("massage1") %>
	<%= request.getAttribute("massage2") %>
	<%= request.getAttribute("massage3") %>
	<%= request.getAttribute("massage4") %>
	<p>
		<a href="http://localhost:8080/Diagnosis/siteTop">サイトトップ</a>
	</p>
</body>
</html>