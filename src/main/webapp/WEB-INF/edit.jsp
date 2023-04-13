<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Edit Expense</title>
</head>
<body>
	<form:form action="/expenses/process/edit/${expense.id}" method="post" modelAttribute="expense">
 	   <input type="hidden" name="_method" value="put"> 
	    <div class="form-group">
	        <form:label path="expenseType">Expense Name</form:label>
	        <form:input type="text" path="expenseType" class="form-control"/>
	        <form:errors path="expenseType"/>
	    </div>
	    <div class="form-group">
	        <form:label path="vendor">Vendor</form:label>
	        <form:input type="text" path="vendor" class="form-control" />
	        <form:errors path="vendor"/>
	    </div>
	     <div class="form-group">
	        <form:label path="amount">Amout</form:label>
	        <form:input type="number" path="amount" class="form-control" />
	        <form:errors path="amount"/>
	    </div>
	   <div class="form-group">
	        <form:label path="description">Description</form:label>
	        <form:input type="text" path="description" class="form-control" />
	        <form:errors path="description"/>
	    </div> 
	    
	    <input type="submit" value="Submit" class="btn btn-primary" />
	</form:form>
</body>
</html>