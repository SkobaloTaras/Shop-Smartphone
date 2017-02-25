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
		<form:form class="form-horizontal" action="/admin/corps" method="POST" modelAttribute="corps">
				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">options</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="options" id="name">
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">caseMaterial</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="caseMaterial" id="name">
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">height</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="height" id="name">
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">width</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="width" id="name">
    				</div>
  				</div>
				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem2" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">depth</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="depth" id="name">
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem3" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">weight</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="weight" id="name">
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem4" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="color" class="col-sm-2 control-label">color</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="color" id="color" items="${colors}" itemLabel="nameOfColor" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">warranty</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="warranty" id="name">
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem5" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="producer" class="col-sm-2 control-label">producer</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="producer" id="producer" items="${producers}" itemLabel="nameOfBrand" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="countryProducing" class="col-sm-2 control-label">countryProducing</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="countryProducing" id="countryProducing" items="${countryProducings}" itemLabel="nameOfCountry" itemValue="id"/>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">touchId</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="touchId" id="name">
    				</div>
  				</div>
		</form:form>
	</div>
</div>
<div class="row">
	<div class="col-md-2 col-xs-2 ">
		<h6>options</h6>
	</div>
	<div class="col-md-2 col-xs-2 ">
		<h6>caseMaterial</h6>
	</div>
	<div class="row">
		<div class="col-md-3 col-xs-3">
			<h6>height</h6>
		</div>
		<div class="col-md-3 col-xs-3">
			<h6>"width"</h6>
		</div>
		<div class="col-md-3 col-xs-3">
			<h6>"depth"</h6>
		</div>
		<div class="col-md-3 col-xs-3">
			<h6>"weight"</h6>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4 col-xs-4 ">
			<h6>color</h6>
		</div>
		<div class="col-md-4 col-xs-4">
			<h6>"producer"</h6>
		</div>
		<div class="col-md-4 col-xs-4">
			<h6>"countryProducing"</h6>
		</div>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>"warranty"</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>"touchId"</h6>
	</div>
	<div class="col-md-2 col-xs-2 ">
		<h6>Update</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>Delete</h6>
	</div>

</div>
<c:forEach items="${corps}" var="corps">
	<div class="row">
		<div class="col-md-2 col-xs-2 ">${corps.options}</div>
		<div class="col-md-2 col-xs-2 ">${corps.caseMaterial}</div>
		<div class="row">
			<div class="col-md-3 col-xs-3 ">${corps.height}${corps.measuringSystem.unitsOfMeasurement}</div>
			<div class="col-md-3 col-xs-3 ">${corps.width}${corps.measuringSystem2.unitsOfMeasurement}</div>
			<div class="col-md-3 col-xs-3 ">${corps.depth}${corps.measuringSystem3.unitsOfMeasurement}</div>
			<div class="col-md-3 col-xs-3 ">${corps.weight}${corps.measuringSystem4.unitsOfMeasurement}</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-xs-4 ">${corps.color.nameOfColor}</div>
			<div class="col-md-4 col-xs-4 ">${corps.producer.nameOfBrand}</div>
			<div class="col-md-4 col-xs-4 ">${corps.countryProducing.nameOfCountry}</div>
		</div>
		<div class="col-md-2 col-xs-2 ">${corps.warranty} ${corps.measuringSystem5.unitsOfMeasurement}</div>
		<div class="col-md-2 col-xs-2 ">${corps.touchId}</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-warning" href="/admin/corps/update/${corps.id}">update</a>
		</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-danger" href="/admin/corps/delete/${corps.id}">delete</a>
		</div>
	</div>
</c:forEach>
