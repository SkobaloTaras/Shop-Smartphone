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
		<form:form class="form-horizontal" action="/admin/processor" method="POST" modelAttribute="processor">
			
			<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">model CPU</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="modelCPU" id="name">
    				</div>
  			</div>
			<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">number Of Cores</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="numberOfCores" id="name">
    				</div>
  			</div>
			<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  			</div>
  			<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">frequency Of CPU</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="frequencyOfCPU" id="name">
    				</div>
  			</div>
			<div class="form-group">
    				<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    				<div class="col-sm-10">
      					<form:select class="form-control" path="measuringSystem2" id="measuringSystem" items="${measuringSystems}" itemLabel="unitsOfMeasurement" itemValue="id"/>
    				</div>
  			</div>
			<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">GPU Model</label>
    				<div class="col-sm-10">
      					<input type="text" class="form-control" name="gpuModel" id="name">
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
	<div class="col-md-2 col-xs-2 ">
		<h6>modelCPU</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>numberOfCores</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>frequencyOfCPU</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>gpuModel</h6>
	</div>
	<div class="col-md-2 col-xs-2 ">
		<h6>Update</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>Delete</h6>
	</div>

</div>
<c:forEach items="${processors}" var="processor">
	<div class="row">
		<div class="col-md-2 col-xs-2 ">${processor.modelCPU}</div>
		<div class="col-md-2 col-xs-2 ">${processor.numberOfCores} ${processor.measuringSystem.unitsOfMeasurement}</div>
		<div class="col-md-2 col-xs-2 ">${processor.frequencyOfCPU} ${processor.measuringSystem2.unitsOfMeasurement}</div>
		<div class="col-md-2 col-xs-2 ">${processor.gpuModel}</div>
		<div class="col-md-1 col-xs-1">
			<a class="btn btn-warning" href="/admin/processor/update/${processor.id}">update</a>
		</div>
		<div class="col-md-1 col-xs-1">
			<a class="btn btn-danger" href="/admin/processor/delete/${processor.id}">delete</a>
		</div>
	</div>
</c:forEach>
