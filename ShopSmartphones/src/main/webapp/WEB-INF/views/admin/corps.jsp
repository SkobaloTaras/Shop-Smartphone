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
<div class="container-fluid"></div>
<div class="row">
	<div class="col-md-12 col-xs-12">
		<form:form class="form-horizontal" action="/admin/corps" method="POST"
			modelAttribute="corps">
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">options</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="options"
						id="name" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">caseMaterial</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="caseMaterial"
						id="name" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">height</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="height"
						id="name" />
				</div>
			</div>
			<div class="form-group">
				<label for="measuringSystem" class="col-sm-2 control-label">Measuring
					system</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="measuringSystem"
						id="measuringSystem" items="${measuringSystems}"
						itemLabel="unitsOfMeasurement" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">width</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="width" id="name" />
				</div>
			</div>
			<div class="form-group">
				<label for="measuringSystem" class="col-sm-2 control-label">Measuring
					system</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="measuringSystem2"
						id="measuringSystem" items="${measuringSystems}"
						itemLabel="unitsOfMeasurement" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">depth</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="depth" id="name" />
				</div>
			</div>
			<div class="form-group">
				<label for="measuringSystem" class="col-sm-2 control-label">Measuring
					system</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="measuringSystem3"
						id="measuringSystem" items="${measuringSystems}"
						itemLabel="unitsOfMeasurement" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">weight</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="weight"
						id="name" />
				</div>
			</div>
			<div class="form-group">
				<label for="measuringSystem" class="col-sm-2 control-label">Measuring
					system</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="measuringSystem4"
						id="measuringSystem" items="${measuringSystems}"
						itemLabel="unitsOfMeasurement" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">color</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="color" id="color"
						items="${colors}" itemLabel="nameOfColor" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">warranty</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="warranty"
						id="name" />
				</div>
			</div>
			<div class="form-group">
				<label for="measuringSystem" class="col-sm-2 control-label">Measuring
					system</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="measuringSystem5"
						id="measuringSystem" items="${measuringSystems}"
						itemLabel="unitsOfMeasurement" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="producer" class="col-sm-2 control-label">producer</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="producer" id="producer"
						items="${producers}" itemLabel="nameOfBrand" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="countryProducing" class="col-sm-2 control-label">countryProducing</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="countryProducing"
						id="countryProducing" items="${countryProducings}"
						itemLabel="nameOfCountry" itemValue="id" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">touchId</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="touchId"
						id="name" />
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
	<table class="table table-striped">
			<tr>
				<th>options</th>
				<th>caseMaterial</th>
				<th>height</th>
				<th>"width"</th>
				<th>"depth"</th>
				<th>"weight"</th>
				<th>color</th>
				<th>"producer"</th>
				<th>"countryProducing"</th>
				<th>"warranty"</th>
				<th>"touchId"</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		<c:forEach items="${corpses}" var="corps">
			<tr>
					<td>${corps.options}</td>
					<td>${corps.caseMaterial}</td>
					<td>${corps.height}${corps.measuringSystem.unitsOfMeasurement}</td>
					<td>${corps.width}${corps.measuringSystem2.unitsOfMeasurement}</td>
					<td>${corps.depth}${corps.measuringSystem3.unitsOfMeasurement}</td>
					<td>${corps.weight}${corps.measuringSystem4.unitsOfMeasurement}</td>
					<td>${corps.color.nameOfColor}</td>
					<td>${corps.producer.nameOfBrand}</td>
					<td>${corps.countryProducing.nameOfCountry}</td>
					<td>${corps.warranty}${corps.measuringSystem5.unitsOfMeasurement}</td>
					<td>${corps.touchId}</td>
					<td><a class="btn btn-warning" href="/admin/corps/update/${corps.id}">update</a></td>
					<td><a class="btn btn-danger" href="/admin/corps/delete/${corps.id}">delete</a></td>
			</tr>
		</c:forEach>

	</table>
</div>








