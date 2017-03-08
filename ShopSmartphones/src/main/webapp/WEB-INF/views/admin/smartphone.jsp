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
		<form:form class="form-horizontal" action="/admin/smartphone" method="POST"
			modelAttribute="smartphone">
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Model</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="model"
						id="name" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">color</label>
				<div class="col-sm-4">
					<form:select class="form-control" path="connectivity" id="connectivity"
						items="${connectivities}" itemLabel="communicationStandards" itemValue="id" />
				</div>
				<div class="col-sm-4">
					<form:select class="form-control" path="connectivity" id="connectivity"
						items="${connectivities}" itemLabel="numberOfSIM" itemValue="id" />
				</div>
				<div class="col-sm-4">
					<form:select class="form-control" path="connectivity" id="connectivity"
						items="${connectivities}" itemLabel="sizeOfSIM" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">OperatingSystem</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="operatingSystem" id="operatingSystem"
						items="${operatingSystems}" itemLabel="nameOfOperationSystem" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">Screen</label>
				<div class="col-sm-2 col-sm-offset-2">
					<form:select class="form-control" path="screen" id="screen"
						items="${screens}" itemLabel="diagonalDisplay" itemValue="id" />
				</div>
				<div class="col-sm-2">
					<form:select class="form-control" path="screen" id="screen"
						items="${screens}" itemLabel="screenResolution" itemValue="id" />
				</div>
				<div class="col-sm-2">
					<form:select class="form-control" path="screen" id="screen"
						items="${screens}" itemLabel="screenType" itemValue="id" />
				</div>
				<div class="col-sm-2">
					<form:select class="form-control" path="screen" id="screen"
						items="${screens}" itemLabel="displayNumberOfColors" itemValue="id" />
				</div>
				<div class="col-sm-2 ">
					<form:select class="form-control" path="screen" id="screen"
						items="${screens}" itemLabel="protectiveGlass" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">Processor</label>
				<div class="col-sm-3">
					<form:select class="form-control" path="processor" id="processor"
						items="${processors}" itemLabel="modelCPU" itemValue="id" />
				</div>
				<div class="col-sm-3">
					<form:select class="form-control" path="processor" id="processor"
						items="${processors}" itemLabel="numberOfCores" itemValue="id" />
				</div>
				<div class="col-sm-3">
					<form:select class="form-control" path="processor" id="processor"
						items="${processors}" itemLabel="frequencyOfCPU" itemValue="id" />
				</div>
				<div class="col-sm-3">
					<form:select class="form-control" path="processor" id="processor"
						items="${processors}" itemLabel="gpuModel" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">Memory</label>
				<div class="col-sm-4">
					<form:select class="form-control" path="memory" id="memory"
						items="${memories}" itemLabel="ram" itemValue="id" />
				</div>
				<div class="col-sm-4">
					<form:select class="form-control" path="memory" id="memory"
						items="${memories}" itemLabel="inbiltMemory" itemValue="id" />
				</div>
				<div class="col-sm-4">
					<form:select class="form-control" path="memory" id="memory"
						items="${memories}" itemLabel="expandedMemory" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">Camera</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="camera" id="camera"
						items="${cameras}" itemLabel="mainCamera" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="camera" id="camera"
						items="${cameras}" itemLabel="videoResolution" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="camera" id="camera"
						items="${cameras}" itemLabel="frontCamera" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="camera" id="camera"
						items="${cameras}" itemLabel="flash" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">InterfacesConnectors</label>
				<div class="col-sm-2">
					<form:select class="form-control" path="interfacesConnectors" id="interfacesConnectors"
						items="${interfacesConnectorses}" itemLabel="wifi" itemValue="id" />
				</div>
				<div class="col-sm-2">
					<form:select class="form-control" path="interfacesConnectors" id="interfacesConnectors"
						items="${interfacesConnectorses}" itemLabel="bluetooth" itemValue="id" />
				</div>
				<div class="col-sm-2">
					<form:select class="form-control" path="interfacesConnectors" id="interfacesConnectors"
						items="${interfacesConnectorses}" itemLabel="navigationSystem" itemValue="id" />
				</div>
				<div class="col-sm-2">
					<form:select class="form-control" path="interfacesConnectors" id="interfacesConnectors"
						items="${interfacesConnectorses}" itemLabel="fmTuner" itemValue="id" />
				</div>
				<div class="col-sm-2">
					<form:select class="form-control" path="interfacesConnectors" id="interfacesConnectors"
						items="${interfacesConnectorses}" itemLabel="nfc" itemValue="id" />
				</div>
				<div class="col-sm-1">
					<form:select class="form-control" path="interfacesConnectors" id="interfacesConnectors"
						items="${interfacesConnectorses}" itemLabel="usbInterface" itemValue="id" />
				</div>
				<div class="col-sm-1">
					<form:select class="form-control" path="interfacesConnectors" id="interfacesConnectors"
						items="${interfacesConnectorses}" itemLabel="jack" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">Battery</label>
				<div class="col-sm-4">
					<form:select class="form-control" path="battery" id="battery"
						items="${batteries}" itemLabel="batteryCapacity" itemValue="id" />
				</div>
				<div class="col-sm-4">
					<form:select class="form-control" path="battery" id="battery"
						items="${batteries}" itemLabel="hoursOfTalkTime" itemValue="id" />
				</div>
				<div class="col-sm-4">
					<form:select class="form-control" path="battery" id="battery"
						items="${batteries}" itemLabel="hoursStandByTime" itemValue="id" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="color" class="col-sm-2 control-label">Corps</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="options" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="caseMaterial" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="height" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="width" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="depth" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="weight" itemValue="id" />
				</div>
				
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="nameOfColor" itemValue="id" />
				</div>
				
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="warranty" itemValue="id" />
				</div>
				
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="nameOfCountry" itemValue="id" />
				</div>
				
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="nameOfBrand" itemValue="id" />
				</div>
				<div class="col-sm-10">
					<form:select class="form-control" path="corps" id="corps"
						items="${corpses}" itemLabel="touchId" itemValue="id" />
				</div>
				
			</div>
			
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Price</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="price"
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
				<th>model</th>
				<th>Connectivity</th>
				<th>OperatingSystem</th>
				<th>Screen</th>
				<th>Processor</th>
				<th>Memory</th>
				<th>Camera</th>
				<th>InterfacesConnectors</th>
				<th>Battery</th>
				<th>Corps</th>
				<th>price</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		<c:forEach items="${smartphones}" var="smartphone">
			<tr>
					<td>${smartphone.model}</td>
					<td>${smartphone.connectivity.communicationStandards}${smartphone.connectivity.numberOfSIM}${smartphone.connectivity.sizeOfSIM}</td>
					<td>${smartphone.operatingSystem.nameOfOperationSystem}</td>
					<td>${smartphone.screen.diagonalDisplay}${smartphone.screen.screenResolution}${smartphone.screen.screenType}${smartphone.screen.displayNumberOfColors}${smartphone.screen.protectiveGlass}</td>
					<td>${smartphone.processor.modelCPU}${smartphone.processor.numberOfCores}${smartphone.processor.frequencyOfCPU}${smartphone.processor.gpuModel}</td>
					<td>${smartphone.memory.ram}${smartphone.memory.inbiltMemory}${smartphone.memory.expandedMemory}</td>
					<td>${smartphone.camera.mainCamera}${smartphone.camera.videoResolution}${smartphone.camera.frontCamera}${smartphone.camera.flash}</td>
					<td>${smartphone.interfacesConnectors.wifi}${smartphone.interfacesConnectors.bluetooth}${smartphone.interfacesConnectors.navigationSystem}${smartphone.interfacesConnectors.fmTuner}${smartphone.interfacesConnectors.nfc}${smartphone.interfacesConnectors.usbInterface}${smartphone.interfacesConnectors.jack}</td>
					<td>${smartphone.battery.batteryCapacity}${smartphone.battery.hoursOfTalkTime}${smartphone.battery.hoursStandByTime}</td>
					<td>${smartphone.corps.options}${smartphone.corps.caseMaterial}${smartphone.corps.height}${smartphone.corps.width}${smartphone.corps.depth}${smartphone.corps.weight}${smartphone.corps.color.nameOfColor}${smartphone.corps.warranty}${smartphone.corps.countryProducing.nameOfCountry}${smartphone.corps.producer.nameOfBrand}${smartphone.corps.touchId}</td>
					<td>${smartphone.price}</td>
					<td><a class="btn btn-warning" href="/admin/smartphone/update/${smartphone.id}">update</a></td>
					<td><a class="btn btn-danger" href="/admin/smartphone/delete/${smartphone.id}">delete</a></td>
			</tr>
		</c:forEach>

	</table>
</div>