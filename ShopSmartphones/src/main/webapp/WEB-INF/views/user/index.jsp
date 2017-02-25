
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>Hello</h2>
<ul>

<c:forEach items="${smartphones}" var="smartphone">
	<li><a href="/smartphones/${smartphone.id}">${smartphone.nameOfBrand}</a></li>
</c:forEach>
</ul>
<a href="/admin">admin</a>
