<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fmt 라이브러리</title>
</head>
<body>

	<c:set var="number" value="12345678" />
	<h2>출력</h2>
	<fmt:formatNumber value="${number }" />
	<br>
	콤마제거 : <fmt:formatNumber value="${number }" type="number" groupingUsed="false" />
	<br>
	
	
	<%-- percent --%>
	<fmt:formatNumber value="1" type="percent" />
	<%-- 40% --%>
	<fmt:formatNumber value="0.4" type="percent" />
	<br>
	<%-- 통화 --%>
	통화 (원) : <fmt:formatNumber value="${number }" type="currency" />
	<br>
	통화 (달러) : <fmt:formatNumber value="${number }" type="currency" currencySymbol="$" />
	
	<fmt:formatNumber value="${number }" type="currency" currencySymbol="$" var="doller" />
	<br>
	통화 변수 출력 : ${dolloer }
	
	<br>
	<h2>패턴</h2>
	<%-- 3.14 --%>
	<fmt:formatNumber value="3.14" pattern="0.0000" />
	<br>
	<fmt:formatNumber value="3.14" pattern="#.####" />
	<br>
	<fmt:formatNumber value="3.141592" pattern="#.####" />
	
	
	<h2>날짜</h2>
	<fmt:formatDate value="${today }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" />
	
	<fmt:formatDate value="${today }" pattern="yyyy/MM/dd hh:mm:ss" var="dateString" />
	데이트 문자열 변수 : ${dateString }
	
	<h2>문자열을 Date객체로 변환</h2>
	<%-- 2022/01/06 07:23:29 --%>
	<fmt:parseDate value="${dateStiring }" pattern="yyyy/MM//dd hh:mm:ss" var="date" />
	
	<fmt:formatDate value="${date }" pattern="yyyy년 MM월 dd일" />
	
	
</body>
</html>


















