<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
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
	<div class="col-md-3 col-xs-12">
		<form:form class="form-inline" action="/admin/producer" method="GET" modelAttribute="filter">
			<custom:hiddenInputs excludeParams="search"/>
			<div class="form-group">
				<form:input path="search" class="form-control" placeholder="Search"/>
			</div>
			<button type="submit" class="btn btn-primary">Ok</button>
		</form:form>
	</div>
	<div class="col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/producer" method="POST" modelAttribute="producer">
					<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="name" style="color:red;text-align:left;"><form:errors path="nameOfBrand"/></label>
					</div>
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label">Name</label>
    					<div class="col-sm-10">
      						<form:input  class="form-control" path="nameOfBrand" id="name"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-default">Create</button>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-xs-4"><h3>Producer name</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${page.content}" var="producer">
				<div class="row">
					<div class="col-md-4 col-xs-4">${producer.nameOfBrand}</div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-warning" href="/admin/producer/update/${producer.id}<custom:allParams/>">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/producer/delete/${producer.id}<custom:allParams/>">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12">
		<div class="row">
					<div class="col-md-6 col-xs-6 text-center">
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle" type="button"
								data-toggle="dropdown">
								Sort <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<custom:sort innerHtml="nameOfBrand asc" paramValue="nameOfBrand" />
								<custom:sort innerHtml="nameOfBrand desc" paramValue="nameOfBrand,desc" />
							</ul>
						</div>
					</div>
					<div class="col-md-6 col-xs-6 text-center">
						<custom:size posibleSizes="1,2,5,10" size="${page.size}" />
					</div>
				</div>
	</div>
</div>
<div class="row">
	<div class="col-md-12 col-xs-12 text-center">
		<custom:pageable page="${page}" cell="<li></li>"
			container="<ul class='pagination'></ul>" />
	</div>
</div>