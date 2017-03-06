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
		<form:form class="form-horizontal" action="/admin/interfacesConnectors"
			method="POST" modelAttribute="interfacesConnectors">
				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="wifi" style="color:red;text-align:left;"><form:errors path="wifi"/></label>
				</div>
				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">wifi</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="wifi" id="name"/>
    				</div>
  				</div>
  				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="bluetooth" style="color:red;text-align:left;"><form:errors path="bluetooth"/></label>
				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">bluetooth</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="bluetooth" id="name"/>
    				</div>
  				</div>
  				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="navigationSystem" style="color:red;text-align:left;"><form:errors path="navigationSystem"/></label>
				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">navigationSystem</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="navigationSystem" id="name"/>
    				</div>
  				</div>
  				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="fmTuner" style="color:red;text-align:left;"><form:errors path="fmTuner"/></label>
				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">fmTuner</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="fmTuner" id="name"/>
    				</div>
  				</div>
  				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="nfc" style="color:red;text-align:left;"><form:errors path="nfc"/></label>
				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">nfc</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="nfc" id="name"/>
    				</div>
  				</div>
  				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="usbInterface" style="color:red;text-align:left;"><form:errors path="usbInterface"/></label>
				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">usbInterface</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="usbInterface" id="name"/>
    				</div>
  				</div>
  				<div class="form-group">
						<label class="col-sm-10 col-sm-offset-2 control-label" for="jack" style="color:red;text-align:left;"><form:errors path="jack"/></label>
				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">jack</label>
    				<div class="col-sm-10">
      					<form:input type="text" class="form-control" path="jack" id="name"/>
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
	<div class="col-md-1 col-xs-1 col-md-offset-1">
		<h6>wifi</h6>
	</div>
	<div class="col-md-1 col-xs-1">
		<h6>bluetooth</h6>
	</div>
	<div class="col-md-1 col-xs-1 ">
		<h6>navigationSystem</h6>
	</div>
	<div class="col-md-1 col-xs-1 ">
		<h6>fmTuner</h6>
	</div>
	<div class="col-md-1 col-xs-1">
		<h6>nfc</h6>
	</div>
	<div class="col-md-1 col-xs-1 ">
		<h6>usbInterface</h6>
	</div>
	<div class="col-md-1 col-xs-1 ">
		<h6>jack</h6>
	</div>
	<div class="col-md-2 col-xs-2 ">
		<h6>Update</h6>
	</div>
	<div class="col-md-2 col-xs-2">
		<h6>Delete</h6>
	</div>

</div>
<c:forEach items="${interfacesConnectorses}" var="interfacesConnectors">
	<div class="row">
		<div class="col-md-1 col-xs-1 col-md-offset-1 ">${interfacesConnectors.wifi}</div>
		<div class="col-md-1 col-xs-1 ">${interfacesConnectors.bluetooth}</div>
		<div class="col-md-1 col-xs-1 ">${interfacesConnectors.navigationSystem}</div>
		<div class="col-md-1 col-xs-1 ">${interfacesConnectors.fmTuner}</div>
		<div class="col-md-1 col-xs-1 ">${interfacesConnectors.nfc}</div>
		<div class="col-md-1 col-xs-1 ">${interfacesConnectors.usbInterface}</div>
		<div class="col-md-1 col-xs-1 ">${interfacesConnectors.jack}</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-warning"
				href="/admin/interfacesConnectors/update/${interfacesConnectors.id}">update</a>
		</div>
		<div class="col-md-2 col-xs-2">
			<a class="btn btn-danger"
				href="/admin/interfacesConnectors/delete/${interfacesConnectors.id}">delete</a>
		</div>
	</div>
</c:forEach>
