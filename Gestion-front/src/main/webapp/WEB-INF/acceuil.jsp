<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<div class="login-page">
  <div class="form">
	<form  class="login-form" action="home" method="POST">
	<p class="title"> Connectez-vous </p>
      <input type="email" placeholder="Adresse email" name="mail" required/>
      <input type="password" placeholder="Mot de passe" name="password" required/>
      <button class="button">Se connecter </button>
    </form>
     </div>
</div>
  </div>
</body>
</html>
 