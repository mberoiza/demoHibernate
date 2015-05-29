<%-- 
    Document   : region
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
 
<c:url var="addAction" value="/region/add" ></c:url>
 
<form:form action="${addAction}" commandName="region">
<table>
    <c:if test="${!empty region.nombre}">
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
            <c:if test="${!empty region.nombre}">
                <input type="submit"
                    value="<spring:message text="Editar Regi&oacute;n"/>" />
            </c:if>
            <c:if test="${empty region.nombre}">
                <input type="submit"
                    value="<spring:message text="Agregar Regi&oacute;n"/>" />
            </c:if>
        </td>
    </tr>
</table>  
</form:form>
<br>
<h3>Lista de regiones</h3>
<c:if test="${!empty listRegiones}">
    <table class="tg">
    <tr>
        <th width="80">ID Regi&oacute;n</th>
        <th width="120">Nombre de la regi&oacute;n</th>
        <th width="60">Editar</th>
        <th width="60">Eliminar</th>
    </tr>
    <c:forEach items="${listRegiones}" var="region">
        <tr>
            <td>${region.id}</td>
            <td>${region.nombre}</td>
            <td><a href="<c:url value='/region/edit/${region.id}' />" >Editar</a></td>
            <td><a href="<c:url value='/region/remove/${region.id}' />" >Eliminar</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
</body>
</html>