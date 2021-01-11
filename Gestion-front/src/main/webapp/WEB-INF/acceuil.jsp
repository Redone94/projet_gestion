<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="container">
		<!-- zone de connexion -->
		<div>
			<h1>Se connecter</h1>
		</div>
		<form action="home" method="POST">

			<label><b>Login</b></label> <input type="mail" placeholder="Entrer votre Login" name="mail" required> 
				<label><b>Mot de passe</b></label> <input type="password" placeholder="Entrer le mot de passe" name="password" required>
			<input type="submit" id='submit' value='LOGIN'>
		</form>
	</div>
</body>
</html>