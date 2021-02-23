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
	<h1>Liste des clients</h1>
	<table border="1">
		<tr><td><b>Nom Client</b></td><td><b>Adresse</b></td></tr>
		<c:forEach items="${listeClients}" var="lcc">
			<tr><td align="center">${lcc.nom}</td><td align="center">${lcc.adr}</td></tr>
		</c:forEach>
	</table>
	
	<a href="addContrat">saisir contrat</a>
	<a href="contrats">liste des contrats</a>
	<a href="addClient">ajouter un client</a>
</center>
</body>
</html>