<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fr.clubraquettes.Entity.Proprietaire.Proprietaire" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Club de raquettes - Espace administration du club</title>
</head>
<body>
	<h2>
	<% 
		Proprietaire proprietaire;
		if(request.getAttribute("admin") != null ){
			proprietaire = (Proprietaire) request.getAttribute("admin");
			out.println("Bonjour " + proprietaire.getPrenom());
		} else {
			out.println("Bonjour");	
		}
	%>
	</h2>
	
	<ul>
		<li>
			<a href="${pageContext.request.contextPath}/club/liste_adherents">Liste des adherents</a>
		</li>
		<li>
			<a href="${pageContext.request.contextPath}/club/ca_mois_precedent">Chiffre d'affaire mois - 1</a>
		</li>
		<li>
			<a href="${pageContext.request.contextPath}/club/status_club">Etat du club</a>
		</li>
	</ul>
</body>
</html>