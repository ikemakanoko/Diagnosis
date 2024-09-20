<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>結果発表</title>
<link rel="stylesheet" href="">

</head>
<body>
	<h1 style="text-align: center">結果発表</h1>
	<c:if test="${id = '1'}">
    	<c:if test="${flg }">
    	ねこ
    	</c:if>
    	<c:if test="${!flg }">
    	いぬ
    	</c:if>
	</c:if>
	<!--<c:set var="animal" value="${param.animalName}" />
    <h2>${animal}です</h2> -->
	<!-- <h2><name="animal">です</h2> -->
	<h2 style="text-align: center">です</h2>
	<p><a href="">サイトトップ</p>
</body>
</html>