<%@include file="header.jsp" %>

	<div class="page-header">
		<h2 class="text-center">Cars</h2>
	</div>
	<div class="container">
<table class="table table-bordered table-striped">
	<thead>
<th>Name</th>
<th>Cost</th>
<th>Tires</th>
	</thead>
	<tbody>
<c:forEach items="${cars }" var="car">
<tr >

<!-- Car details -->
<td>${car.name}</td>
<td>${car.cost}</td>
<td><a href="tires/add/${car.id}" class="btn btn-primary ">Add tire</a>
<td><a href="cars/edit/${car.id}" class="btn btn-primary ">Edit</a>
</td><td><a href="cars/delete/${car.id}" class="btn btn-primary ">Delete</a></td>
</tr>

<!-- Tire details -->
<c:forEach items="${car.tires }" var="tire">
<tr >
<td>
${tire.name} 
</td>
</c:forEach>
</tr>

</c:forEach>
</tbody>
</table>
</div>
<a href="cars/add" class="btn btn-primary offset2">Add</a>
<%@include file="footer.jsp" %>
