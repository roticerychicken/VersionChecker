<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
	Version 1: <input type="text" name="v1" />
	<br>
	Version 2: <input type="text" name="v2" />
	<input type="submit" value="Check">
</form>
 
<%

String v1 = com.versioncheck.jsp.CalculateVersion.getVersion(request.getParameter("v1"));
String v2 = com.versioncheck.jsp.CalculateVersion.getVersion(request.getParameter("v2"));

%>

<h2><% if((v1.length() > 0)&&(v2.length() > 0)){out.print(v1);}%> <% out.print(com.versioncheck.jsp.CalculateVersion.calculate(v1, v2)); %> <% if((v1.length() > 0)&&(v2.length() > 0)){out.print(v2);} %> </h2>


</body>
</html>