<%@include file="header.jsp" %>

<% int trId=1; int parentId;%>
<link href="${pageContext.request.contextPath}/resources/css/jquery.treetable.css" rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath}/resources/js/jquery.treetable.js"></script>
<script>
$("#tree-table").treetable();
</script>
	<div class="page-header">
		<h2 class="text-center">Cars</h2>
	</div>
	<div class="container">
<table id="tree-table">
	<thead>
<th>Name</th>
<th>Cost</th>
<th>Tires</th>
	</thead>
	<tbody>
<c:forEach items="${cars }" var="car">
<tr data-tt-id="<%out.print( trId);parentId=trId;trId++; %>">

<!-- Car details -->
<td>${car.name}</td>
<td>${car.cost}</td>
<td><a href="edit/${car.id}" class="btn btn-primary ">Edit</a>
</td><td><a href="delete/${car.id}" class="btn btn-primary ">Delete</a></td>
</tr>

<!-- Tire details -->
<c:forEach items="${car.tires }" var="tire">
<tr data-tt-id="<%out.print( trId);trId++; %>" data-tt-parent-id="<%=parentId %>" >
<td>
${tire.name} 
</td>
</c:forEach>
</tr>

</c:forEach>
</tbody>
</table>
</div>
<a href="add" class="btn btn-primary offset2">Add</a>
<%@include file="footer.jsp" %>
