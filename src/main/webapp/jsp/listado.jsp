<%-- 
    Document   : listado
    Created on : 31-ene-2018, 15:52:58
    Author     : jesus
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="/jsp/inc/header.jsp"/> 
    </head>
    <body class="container">
        <h1>He aquí su listado de ${param.tipo}</h1>
        <c:forEach items="${listado}" var="persona">
            <h2>Código: ${persona.id}</h2>
            <p>Tipo de persona: ${persona.getClass().getSimpleName()}</p>
            <p>Nombre: ${persona.nombre}</p>
            <p>Fecha de nacimiento: <fmt:formatDate value="${persona.fechNac}"/></p>
            <c:choose>
                <c:when test="${tipoPersona.equals(\"normal\")}">
                    <p>Ocupación: ${persona.ocupacion}</p>
                </c:when>
                <c:when test="${tipoPersona.equals(\"tecnologo\")}">
                    <p>Años de estudio: ${persona.aniosDeEstudios}</p>
                </c:when> 
                <c:when test="${tipoPersona.equals(\"programador\")}">
                    <p>Años de estudio: ${persona.aniosDeEstudios}</p>
                    <p>Años de experiencia: ${persona.aniosDeExperiencia}</p>
                    <p>Lenguaje favorito: ${persona.lenguajeFavorito}</p>
                </c:when>
                <c:when test="${tipoPersona.equals(\"tester\")}">
                    <p>Años de estudio: ${persona.aniosDeEstudios}</p>
                    <p>Herramienta de testeo: ${persona.herramientaDeTesteo}</p>
                </c:when>
            </c:choose>
            
        </c:forEach>
                <a href="<c:url value="/index.jsp"/>" class="btn btn-info">Menú inicial</a>
    </body>
</html>
