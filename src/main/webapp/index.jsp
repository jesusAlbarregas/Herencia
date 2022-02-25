<%-- 
    Document   : index
    Created on : 30-ene-2018, 17:28:26
    Author     : Jesus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="/jsp/inc/header.jsp"/> 
    </head>
    <body class="container text-center">
        <h1>Elige una opción:</h1>
        <form action="<c:url value="/ControlHerencia"/>" method="post" class="form-inline">
            <p>Dar de alta a alguien <button name="donde" value="alta" class="btn btn-default">Alta</button></p>
            <p>Ó</p>
            <p>Visualizar todos/as los/as 
                <select name="tipo" class="form-control">
                    <option value="Persona">Personas</option>
                    <option value="Normal">Normales</option>
                    <option value="Tecnologo">tecnologos</option>
                    <option value="Tester">Testeadores</option>
                    <option value="Programador">Programadores</option>
                </select>
                <button name="donde" value="visualizar" class="btn btn-default">Visualizar</button>
            </p>
        </form>
    </body>
</html>
