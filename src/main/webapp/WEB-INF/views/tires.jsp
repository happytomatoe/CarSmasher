<%@include file="header.jsp" %>

	<div class="page-header">
		<h2 class="text-center">Tires</h2>
	</div>
	<div class="container">
<table id="table table-condensed table-bordered">
	<thead>
<th>Name</th>
<th>Cost</th>
<th>Size</th>
	</thead>
	<tbody>


<!-- Tire details -->
<c:forEach items="${car.tires }" var="tire">
<tr>
<td>
${tire.name}
</td>
<td> 
${tire.cost} 
</td>
<td>
${tire.size }
</td>
</c:forEach>
</tr>
</tbody>
</table>
</div>
<a href="add" class="btn btn-primary offset2">Add</a>
<%@include file="footer.jsp" %>
