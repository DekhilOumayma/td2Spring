<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Liste des voiture disponibles</h1>
	<table border="1">
		<tr><td><b>id</b></td><td><b>marque</b></td><td><b>disponobilite</b></td></tr>
		<c:forEach items="${liste}" var="lv">
			<tr><td align="center">${lv.id}</td><td align="center">${lv.marque}</td><td align="center">${lv.dispo}</td></tr>
		</c:forEach>
	</table>
	<a href="addContrat">saisir contrat</a>
	<a href="contrats">Liste des contrats</a>
	<a href="addClient">ajouter un client</a>
	<a href="clients">Liste des clients</a>
	
</center>
</body>
</html>