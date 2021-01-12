<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

<link rel="stylesheet" href="css/style.css">

</head>
<body>
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
		<td>${m.nom}</td>
	</tr>
	<tr>
		<td colspan="2">Prenom :</td>
		<td>${m.prenom}</td>
	</tr>
	</table>
<div id="content">
  <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
    <li class="nav-item">
      <a class="nav-link active" id="pills-emp-tab" data-toggle="pill" href="#pills-emp" role="tab" aria-controls="pills-emp" aria-selected="true">Gestion employés</a>
    </li>
    <li class="nav-item">
      <a class="nav-link " id="pills-conge-tab" data-toggle="pill" href="#pills-conge" role="tab" aria-controls="pills-conge" aria-selected="false">Gestion Congés</a>
    </li>
  </ul>
  
  <div class="tab-content" id="pills-tabContent">
    <div class="tab-pane fade show active" id="pills-emp" role="tabpanel" aria-labelledby="pills-emp-tab">
</body>


<h1>Liste des employés</h1>
           <table class="table table-striped">
             <thead>
               <tr>
                 <th>Id</th>
                 <th>Nom</th>
                 <th>Prenom</th>
                 <th>Mail</th>
                 <th>Service</th>
                 </tr>
             </thead>
             <tbody>
				<c:forEach items="${employe}" var="e">
             
               <tr>
               
                 <td>${e.id}</td>
                 <td>${e.nom}</td>
                 <td>${e.prenom}</td>
                 <td>${e.mail}</td>
                 <td>${e.service.id}</td>
               </tr>
				</c:forEach>
         
             </tbody>
           </table>


<!-- Tableau gestion des congés (showAll + accepter + refuser) -->
    <div class="tab-pane fade" id="pills-conge" role="tabpanel" aria-labelledby="pills-conge-tab">


      <h1>Liste des Congés</h1>

      <table class="table table-striped">
        <thead>
          <tr>
            <th>id</th>
            <th>Date-demande</th>
            <th>Date_debut</th>       
            <th>Date-fin</th>            
            <th>motif</th>
            <th>Nbr_jours</th>
            <th>statut</th>
            <th>TypeC</th>
            <th>Employe</th>
            <th>Commentaire</th>
            <th>Actions</th>
            </tr>
        </thead>
        <tbody>
       <c:forEach items="${conge}" var="c">
             
               <tr>
               
                 <td>${c.id}</td>
                 <td>${c.demande}</td>
                 <td>${c.debut}</td>
                 <td>${c.fin}</td>
                 <td>${c.motif}</td>
                 <td>${c.nbr_jours}</td>                 
                 <td>${c.statut}</td>
                 <td>${c.typec}</td>
                 <td>${c.employe.id}</td>
                 <td>${c.commentaire}</td>
                 
                 
            <td>
              <input onclick="AccepterD()" type="button" class ="btn btn-warning" value="Accepter">            
              <input onclick="RefuserD(${c.id},'${c.commentaire}','${c.statut}')" type="button" class ="btn btn-danger" value="Refuser">
            </td>
          </tr>
           </c:forEach>
        </tbody>
      </table>
      
<div id="Refuser" >
  <h3>Modifier l'état du congé</h3>
  <form action="manager" method="post" style="display: inline-flex;">
	<input type="hidden" id="id_c" name="id_c" value="${conge[0].id}">
    <label id="add_statut" for="update_Statut">Statut : Refusé</label>
    <input type="hidden" id="add_statut" name="statut" value="Refusé">
    <label for="add_commentair">Commentaire :</label> <input required id="add_commentaire" name="commentaire" type="text" placeholder="Saisir votre commentaire"><br>
  	<input class ="btn btn-warning" type="submit" name="valider" value="valider">
  </form>
</div>




</html>

<script>
function AccepterD(){
	
	statut="Accepté";
	update_statut=statut;
}
function RefuserD(id,commentaire,statut){
	Refuser.style.display="block";
	//add_statut.value="Refusé";
	add_commentaire.value=commentaire;
	id_c.value=id;
	
}

</script>
