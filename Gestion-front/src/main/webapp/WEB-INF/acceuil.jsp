<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- importer le fichier de style -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="logo">
  <img title="ajc classroom" class="img-responsive" id="header-logo" src="http://188.165.51.107/web/css/themes/cool_blue/images/header-logo-custom1.png" alt="AJC FORMATION">
</div>
<div id="container">
		<!-- zone de connexion -->
		<div>
			<h1>Se connecter</h1>
		</div>
		<form action="home" method="POST">
      <input type="email" placeholder="Adresse email" name="mail" required/>
      <input type="password" placeholder="Mot de passe" name="password" required/>
      <button class="button">Connexion </button>
    </form>
  </div>
</body>
</html>
 