<%-- 
    Document   : pais
    Created on : 28-05-2015, 9:32:30
    Author     : mberoiza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Person Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Agregar Regi&oacute;n
</h1>
 
<c:url var="addAction" value="/pais/add" ></c:url>
 
<form:form action="${addAction}" commandName="pais">
<table>
    <c:if test="${!empty pais.nombre}">
    <tr>
        <td>
            <form:label path="id">
                <spring:message text="ID"/>
            </form:label>
        </td>
        <td>
            <form:input path="id" readonly="true" size="8"  disabled="true" />
            <form:hidden path="id" />
        </td> 
    </tr>
    </c:if>
    <tr>
        <td>
            <form:label path="nombre">
                <spring:message text="Nombre"/>
            </form:label>
        </td>
        <td>
            <form:input path="nombre" />
        </td> 
    </tr>
    <tr>
        <td colspan="2">
            <c:if test="${!empty pais.nombre}">
                <input type="submit"
                    value="<spring:message text="Editar Pa&iacute;s"/>" />
            </c:if>
            <c:if test="${empty pais.nombre}">
                <input type="submit"
                    value="<spring:message text="Agregar Pa&iacute;s"/>" />
            </c:if>
        </td>
    </tr>
</table>  
</form:form>
<br>
<h3>Lista de paises</h3>
<c:if test="${!empty listPaises}">
    <table class="tg">
    <tr>
        <th width="80">ID Pa&iacute;s</th>
        <th width="120">Nombre del pa&iacute;s</th>
        <th width="60">Editar</th>
        <th width="60">Eliminar</th>
    </tr>
    <c:forEach items="${listPaises}" var="pais">
        <tr>
            <td>${pais.id}</td>
            <td>${pais.nombre}</td>
            <td><a href="<c:url value='/edit/${pais.id}' />" >Editar</a></td>
            <td><a href="<c:url value='/remove/${pais.id}' />" >Eliminar</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
</body>
</html>