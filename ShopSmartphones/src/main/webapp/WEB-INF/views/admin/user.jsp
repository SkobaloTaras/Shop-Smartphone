<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="/admin/smartphone">Smartphone</a></li>
					<li><a href="/admin/producer">Producer</a></li>
					<li><a href="/admin/countryProducing">CountryProducing</a></li>
					<li><a href="/admin/connectivity">Connectivity</a></li>
					<li><a href="/admin/operatingSystem">OperatingSystem</a></li>
					<li><a href="/admin/screen">Screen</a></li>
					<li class="active"><a href="/admin/processor">Processor</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/memory">Memory</a></li>
					<li><a href="/admin/camera">Camera</a></li>
					<li><a href="/admin/interfacesConnectors">InterfacesConnectors</a></li>
					<li><a href="/admin/battery">Battery</a></li>
					<li><a href="/admin/corps">Corps</a></li>
					<li><a href="/admin/color">Color</a></li>
					<li><a href="/admin/measuringSystem">measuringSystem</a></li>
							<li><a href="/admin/user">User</a></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="col-md-3 col-xs-12"></div>
	<div class="col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/user" method="POST"  modelAttribute="user">
					<form class="form-horizontal" action="/admin/user" method="POST">
					<div class="form-group">
						<label for="name" class="col-sm-2 control-label">Name</label>
						<div class="col-sm-10">
							<form:input type="text" class="form-control" path="name" id="name"/>
						</div>
					</div>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Surname</label>
							<div class="col-sm-10">
								<form:input type="text" class="form-control" path="surname" id="name"/>
						</div>
					</div>
					<div class="form-group">
							<label for="name" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-10">
								<form:input type="text" class="form-control" path="email" id="name"/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-primary">Create</button>
						</div>
					</div>
				</form>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-xs-2 col-md-offset-2"><h3>Name</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Surname</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Email</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Update</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Delete</h3></div>
		</div>
		<c:forEach items="${users}" var="user">
			<div class="row">
				<div class="col-md-2 col-xs-2 col-md-offset-2" >${user.name}</div>
				<div class="col-md-2 col-xs-2">${user.surname}</div>
				<div class="col-md-2 col-xs-2">${user.email}</div>
				<div class="col-md-2 col-xs-2"><a class="btn btn-warning" href="/admin/user/update/${user.id}">update</a></div>
				<div class="col-md-2 col-xs-2"><a class="btn btn-danger" href="/admin/user/delete/${user.id}">delete</a>
				</div>
			</div>
		</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>