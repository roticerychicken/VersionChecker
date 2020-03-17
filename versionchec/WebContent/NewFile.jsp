<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>

<title>Insert title here</title>
</head>
<body>
<form action="VersionServlet" method="GET">
	<input type="text" placeholder="Version 1" name="v1" autocomplete="off" />
	<input type="text" placeholder="Version 2" name="v2" autocomplete="off" />
	<input type="submit" value="Check">
</form>
</body>
</html>