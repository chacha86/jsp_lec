<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>게시물 등록</h1>
<body>
	<%
	// 드라이버 정보
	String driver = "com.mysql.cj.jdbc.Driver";
	// dbms 주소p
	String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";
	// 사용자 계정
	String user = "sbsst";
	// 사용자 비밀번호
	String pass = "sbs123414";
	
	Connection conn = null;
	%>
	<form action="/web-exam1/article">
		제목 : <input type="text" name="title" />
		<br>
		내용 : <input type="text" name="body" />
		<br>
		<input type="hidden" name="mid" value="1"/>
		<input type="hidden" name="action" value="insert"/>
		<input type="submit" />
		
	</form>	
	
</body>
</html>