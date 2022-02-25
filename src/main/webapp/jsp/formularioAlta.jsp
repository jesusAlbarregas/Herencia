<%-- 
    Document   : formularioAlta
    Created on : 30-ene-2018, 17:49:47
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
    <body class="container">
        <h1>Alta de persona Normal</h1>
        <form action="Alta" method="post">
            <div class="form-group">
                <label for="nombre">Nombre: </label>
                <input type="text" name="nombre" id="nombre" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="fechNac">Fecha de nacimiento: </label>
                <input type="date" name="fechNac" id="fechNac" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="ocupacion">Ocupación: </label>
                <input type="text" name="ocupacion" id="ocupacion" class="form-control"/>
            </div>
            <button name="tipo" value="Normal" class="btn btn-success">Alta</button>
        </form>
        <h1>Alta de persona tecnóloga</h1>
        <form action="Alta" method="post">
            <div class="form-group">
                <label for="nombre">Nombre: </label>
                <input type="text" name="nombre" id="nombre" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="fechNac">Fecha de nacimiento: </label>
                <input type="date" name="fechNac" id="fechNac" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="aniosDeEstudios">Años de estudio: </label>
                <input type="number" name="aniosDeEstudios" id="aniosDeEstudios" class="form-control"/>
            </div>
            <button name="tipo" value="Tecnologo" class="btn btn-success">Alta</button>
        </form>
        <h1>Alta de persona tecnóloga programadora</h1>
        <form action="Alta" method="post">
            <div class="form-group">
                <label for="nombre">Nombre: </label>
                <input type="text" name="nombre" id="nombre" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="fechNac">Fecha de nacimiento: </label>
                <input type="date" name="fechNac" id="fechNac" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="aniosDeEstudios">Años de estudio: </label>
                <input type="number" name="aniosDeEstudios" id="aniosDeEstudios" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="aniosDeExperiencia">Años de experiencia: </label>
                <input type="number" name="aniosDeExperiencia" id="aniosDeExperiencia" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="lenguajeFavorito">Lenguaje favorito: </label>
                <input type="text" name="lenguajeFavorito" id="lenguajeFavorito" class="form-control"/>
            </div>
            <button name="tipo" value="Programador" class="btn btn-success">Alta</button>
        </form>
        <h1>Alta de persona tecnóloga testeadora</h1>
        <form action="Alta" method="post">
            <div class="form-group">
                <label for="nombre">Nombre: </label>
                <input type="text" name="nombre" id="nombre" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="fechNac">Fecha de nacimiento: </label>
                <input type="date" name="fechNac" id="fechNac" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="aniosDeEstudios">Años de estudio: </label>
                <input type="number" name="aniosDeEstudios" id="aniosDeEstudios" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="herramientaDeTesteo">Herramienta de testeo: </label>
                <input type="text" name="herramientaDeTesteo" id="herramientaDeTesteo" class="form-control"/>
            </div>
            <button name="tipo" value="Tester" class="btn btn-success">Alta</button>
        </form>
        <br/>
        <a href="<c:url value="/index.jsp"/>" class="btn btn-info">Volver al menú inicial</a>
    </body>
</html>
