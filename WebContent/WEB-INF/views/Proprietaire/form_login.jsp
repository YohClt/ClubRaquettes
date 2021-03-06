<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Club Raquettes - Zone Administration - Connexion</title>
		<link href="/../css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
	    <div class="container">
	    <div class="message">
	    	<% if(request.getAttribute("message") != null){
	    		out.println(request.getAttribute("message"));
	    		}
	    		%>
	    </div>
	      <form class="form-signin" action="${pageContext.request.contextPath}/club/admin_connexion" method="post">
	        <h2 class="form-signin-heading">Renseigner vos information de connexion</h2>
	        <label for="inputEmail" class="sr-only">Courriel</label>
	        <input type="email" name="courriel" id="inputEmail" class="form-control" placeholder="Courriel" required autofocus>
	        <label for="inputPassword" class="sr-only">Mot de passe</label>
	        <input type="password" name="motDePasse" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
	        <input class="btn btn-lg btn-primary btn-block" type="submit" value="connexion"/>
	      </form>
	    </div>
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	    <script src="/../js/bootstrap.min.js"></script>
  </body>
</html>