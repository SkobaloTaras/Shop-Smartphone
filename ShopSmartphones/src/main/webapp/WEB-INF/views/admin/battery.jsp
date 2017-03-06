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
<div class="row">
	<div class="col-md-12 col-xs-12">
		<form:form class="form-horizontal" action="/admin/battery" method="POST" modelAttribute="battery">
				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="batteryCapacity" style="color:red;text-align:left;"><form:errors path="batteryCapacity"/></label>
				</div>
				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">Battery Capacity</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="batteryCapacity" id="name"/>
    				</div>
  				</div>
				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="hoursOfTalkTime" style="color:red;text-align:left;"><form:errors path="hoursOfTalkTime"/></label>
				</div>	
				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">hoursOfTalkTime</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="hoursOfTalkTime" id="name"/>
    				</div>
  				</div>	
				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem2" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  				</div>
				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="hoursStandByTime" style="color:red;text-align:left;"><form:errors path="hoursStandByTime"/></label>
				</div>
				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">hoursStandByTime</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="hoursStandByTime" id="name"/>
    				</div>
  				</div>
				<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem3" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
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
		<h6>Capacity</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>hoursOfTalkTime</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>hoursStandByTime</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>Update</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>Delete</h6>
	</div>
</div>
<c:forEach items="${batteries}" var="battery">
	<div class="row">
		<div class="col-md-2 col-xs-2 col-md-offset-2">${battery.batteryCapacity} ${battery.measuringSystem.unitsOfMeasurement}</div>
		<div class="col-md-2 col-xs-2">${battery.hoursOfTalkTime} ${battery.measuringSystem2.unitsOfMeasurement}</div>
		<div class="col-md-2 col-xs-2">${battery.hoursStandByTime} ${battery.measuringSystem3.unitsOfMeasurement}</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-warning" href="/admin/battery/update/${battery.id}">update</a>
		</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-danger" href="/admin/battery/delete/${battery.id}">delete</a>
		</div>
	</div>
</c:forEach>
