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
	<%=request.getAttribute("massageEI")%>
	<%=request.getAttribute("massageSN")%>
	<%=request.getAttribute("massageTF")%>
	<%=request.getAttribute("massageJP")%>
	<p>
		<a href="http://localhost:8080/Diagnosis/siteTop">サイトトップ</a>
	</p>
</body>
</html>