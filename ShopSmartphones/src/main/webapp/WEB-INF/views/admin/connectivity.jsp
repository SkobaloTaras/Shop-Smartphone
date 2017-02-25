<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
						<ul class="nav navbar-nav">
							<li><a href="/admin/smartphone">Smartphone</a></li>
							<li><a href="/admin/producer">Producer</a></li>
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
						</ul>
					</div>
		</div>
	</nav>
</div>
<div class="container-fluid"></div>
<div class="row">
	<div class="col-md-12 col-xs-12">
		<form:form class="form-horizontal" action="/admin/connectivity" method="POST" modelAttribute="connectivity">
				
				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">communication Standards</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="communicationStandards" id="name">
    				</div>
  				</div>
				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">numberOfSIM</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="numberOfSIM" id="name">
    				</div>
  				</div>	
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">sizeOfSIM</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="sizeOfSIM" id="name">
    				</div>
  				</div>	
				<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Create</button>
    					</div>
  				</div>
		</form:form>
	</div>
</div>
<div class="row">
	<div class="col-md-2 col-xs-2 col-md-offset-2">
		<h6>communityStandards</h6>
	</div>
	<div class="col-md-2 col-xs-2 ">
		<h6>numberOfSIM</h6>
	</div>
	<div class="col-md-2 col-xs-2 ">
		<h6>sizeOfSIM</h6>
	</div>
	<div class="col-md-2 col-xs-2 ">
		<h6>Update</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>Delete</h6>
	</div>

</div>
<c:forEach items="${connectivities}" var="connectivity">
	<div class="row">
		<div class="col-md-2 col-xs-2 col-md-offset-2">${connectivity.communicationStandards} ${connectivity.measuringSystem.unitsOfMeasurement}</div>
		<div class="col-md-2 col-xs-2 ">${connectivity.numberOfSIM}</div>
		<div class="col-md-2 col-xs-2 ">${connectivity.sizeOfSIM}</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-warning" href="/admin/connectivity/update/${connectivity.id}">update</a>
		</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-danger" href="/admin/connectivity/delete/${connectivity.id}">delete</a>
		</div>
	</div>
</c:forEach>
