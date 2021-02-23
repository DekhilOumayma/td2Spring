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
	<h1>Liste des contrats</h1>
	<table border="1">
		<tr><td><b>id Contrat</b></td><td><b>Nom Client</b></td><td><b>Marque voiture</b></td><td><b>Date Debut</b></td><td><b>Date Fin</b></td></tr>
		<c:forEach items="${listeContrats}" var="lv">
			<tr><td align="center">${lv.id}</td><td>${lv.client.nom}</td><td>${lv.voiture.marque}</td><td>${lv.dated}</td><td>${lv.datef}</td></tr>
		</c:forEach>
	</table>
	
	<a href="addContrat">saisir contrat</a>
	<a href="clients">Liste des clients</a>
	<a href="addClient">ajouter un client</a>
</center>
</body>
</html>