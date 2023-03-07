<%-- 
    Document   : affichage
    Created on : 3 mars 2023, 06:21:28
    Author     : falyarivelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
	String url=(String) request.getAttribute("url");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> fs </title>
</head>
<body>
	<h1> L'url est: <%= url %> </h1>
</body>
</html>
