<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.fipp.gerenciador.model.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Empresa</title>
</head>
<body>

	<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	
	<br/><br/>
	Lista de empresas: <br />
	
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			
			<li>
				${ empresa.nome } - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
				<a href="/gerenciador/MostraEmpresa?id=${ empresa.id }">edita</a>
				<a href="/gerenciador/RemoveEmpresa?id=${ empresa.id }">remove</a>
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>