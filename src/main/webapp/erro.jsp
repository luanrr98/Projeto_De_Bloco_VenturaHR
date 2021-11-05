<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro - VenturaHR</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container p-3 my-3 border bg-primary">
		<header>
			<h1 class="display-5 text-center">VenturaHR</h1>
		</header>
	</div>
	<hr>
	<%
	List<String> erros = (List<String>) request.getAttribute("erros");
	%>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Erro(s) <%=erros.size()%></th>
			</tr>
		</thead>
		<%
		for (String erro : erros) {
		%>
		<tbody>
			<tr>
				<td class="text-danger"><%= erro%></td>
			</tr>
		</tbody>
		<%
		}
		%>

	</table>
        <hr>
	<div class="container">
		<footer>
			<h6 class="text-center small">Todos os direitos Reservados</h6>
		</footer>
	</div>
</body>
</html>