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
		<h2>Ajouter un client</h2>
		<form:form method="POST" action="saveClient" modelAttribute="cl">
			<h3>Nom</h3><form:input path="nom"/><br>
			<h3>adress</h3><form:input path="adr"/><br>
			<p></p><input type="submit" value="Ajouter">
		</form:form>
</center>
</body>
</html>