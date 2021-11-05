<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucesso - VenturaHR</title>
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
	String nome = (String) request.getAttribute("nome");
	String email = (String) request.getAttribute("email");
	String tipo = (String) request.getAttribute("tipo");
	%>
	<hr>
	<div class="container">
		<h3 class="text-success"> <%= tipo %> <%=nome%> com o email <%=email%> foi salvo com sucesso!</h3>
		
	</div>
	<hr>
	<div class="container">
		<footer>
			<h6 class="text-center small">Todos os direitos Reservados</h6>
		</footer>
	</div>

</body>
</html>