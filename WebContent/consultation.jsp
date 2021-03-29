<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="MonCompte" scope="session" class="persistence.entities.Compte" type="persistence.entities.Compte"/>
<jsp:setProperty property="*" name="MonCompte"/>
Le proprietairte du compte est : <jsp:getProperty property="proprietaire" name="MonCompte"/> <br> 
Le solde est de : <jsp:getProperty property="solde" name="MonCompte"/> <br>
Le numeros du compte est : <jsp:getProperty property="numCompte" name="MonCompte"/> <br>
</body>
</html>