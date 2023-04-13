<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Expense Details</title>
</head>
<body>
	<h1>Expense Name: <c:out value="${expense.expenseType}"/></h1>
	<h1>Vendor: <c:out value="${expense.vendor}"/></h1>
	<h1>Amount Spent: <c:out value="${expense.amount}"/></h1>
 	<h1>Expense Description: <c:out value="${expense.description}"/></h1> 
</body>
</html>