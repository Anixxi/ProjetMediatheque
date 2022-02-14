<%@ page import="java.util.Date" %>
<%
Date today = new Date();
String nom;
String sexe;
String sexeNom;
%>

<%
if(sexe.equals("M")){
	sexeNom += "Monsieur";
}else {
	sexeNom += "Madame";
}

%>

<html>
	<body>
		<h1>Page d'accueil</h1>
		<p> Bonjour, on est le <%= today.toString() %> ! </p> 
		<p> Bonjour <%= sexeNom.toString()%> <%= nom.toString()%> </p>
		
	</body>
	
	
</html>