<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Ajouter un contrat</h1>
	<form:form method="POST" action="saveContrat" modelAttribute="cl">
		<form:input path="id" type="hidden"/><br>
		<h3>client : </h3><form:select path="client.nump" itemLabel="nom" itemValue="nump" items="${clts}"/><br>
		<h3>voiture : </h3><form:select path="voiture.id" itemLabel="marque" itemValue="id" items="${vts}"/><br>
		<h3>date Debut : </h3><form:input path="dated"/><br>
		<h3>date Fin : </h3><form:input path="datef"/><br>
		<p></p><input type="submit" value="Ajouter">
	</form:form>
<center>
</body>
</html>
