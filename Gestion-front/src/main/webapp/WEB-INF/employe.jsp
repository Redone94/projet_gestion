<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>

<link rel="stylesheet" href="css/style.css">


</head>
<div class="logo">
	<img title="ajc classroom" class="img-responsive" id="header-logo"
		src="http://188.165.51.107/web/css/themes/cool_blue/images/header-logo-custom1.png"
		alt="AJC FORMATION">
</div>

<div class="header-inner-cell ">
	<button class="header-item">Se deconnecter</button>
</div>
<table class="en-tete">
	<tr>
		<td colspan="2">Nom :</td>
		<td>${emp.nom}</td>
	</tr>
	<tr>
		<td colspan="2">Prenom :</td>
		<td>${emp.prenom}</td>
	</tr>
	<tr>
		<td colspan="2">Manager :</td>
		<td>${emp.manager}</td>
	</tr>
	<tr>
		<td colspan="2">Service :</td>
		<td>${emp.id_s}</td>
	</tr>
</table>

<div class="title1-center">
	<p class="title1">Gestion des congés</p>
	<button class="button1">Nouvelle demande</button>
	<button class="button1">Liste de mes demandes</button>
</div>




</html>





<script>
	function updateCong() {
	}
</script>