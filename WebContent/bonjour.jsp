<%@ page pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bonjour</title>
</head>
<body>

<c:if test=" ${ !empty sessionScope.nom && !empty sessionScope.prenom } ">
<p>Vous êtes  ${ sessionScope.nom }  ${ sessionScope.prenom } ! </p>
</c:if>

<form method="get" action="bonjour">

Nom : <input type="text" name="nom" />
Prénom : <input type="text" name="prenom" />

<input type="submit" value="Valider" name="valide" />

</form>


</body>
</html>