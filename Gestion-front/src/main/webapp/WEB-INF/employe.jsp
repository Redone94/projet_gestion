<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/style.css">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<div class="logo">
	<img title="ajc classroom" class="img-responsive" id="header-logo"
		src="http://188.165.51.107/web/css/themes/cool_blue/images/header-logo-custom1.png"
		alt="AJC FORMATION">
</div>
<div class="header-inner-cell ">
	<button class="header-item">Se déconnecter</button>
</div>
<body>

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
			<td>${m.nom} ${m.prenom}</td>
		</tr>
		<tr>
			<td colspan="2">Service :</td>
			<td>${emp.service.libelle}</td>
		</tr>
	</table>
	<div class="title1-center">
		<p class="title1">Gestion des congés</p>
		<button class="button1">Nouvelle demande</button>
		<button class="button1">Liste de mes demandes</button>
	<div class="login-page">
		<div class="form">
			<p class="title">Nouvelle demande</p>
			<form action="gestionEmploye.html" method="get">
				<p id="dateDemande" name="dateDemande">Date de la demande :
					${dateDemande}</p>
				Date de début : <input type="date" name="dateDebut"
					min=${dateDD
					} value=${dateDD}> <br /> <br /> Date
				de fin : <input type="date" name="dateFin" min=${dateDD
					}
					value=${dateDD}><br /> <br /> Type de congés : <select
					class="" name="typeConge">
					<option value="choix1">Congés payés</option>
					<option value="choix2">Congés sans solde</option>
					<option value="choix3">Absence autorisée</option>
					<option value="choix4">Absence justifiée</option>
				</select><br /> <br /> Motif de votre demande : <input type="text"
					name="motif"><br /> <br /> <input id="bV" type="submit"
					value="Valider"> <input id="bA" type="reset"
					value="Annuler">
			</form>
		</div>
	</div>
	</div>
</body>
</html>