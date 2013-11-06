<%@include file="header.jsp" %>
<h2 class="text-center">Edit</h2>
<form  class="form-horizontal" method="post">

	<input type="hidden" name="id" value="${tire.id}"/>
	<div class="control-group">
	<label for="name" class="control-label">Name</label>
	<div class="controls">
	<input type="text" name="name" required value="${car.name}"/>
	</div>
</div>


<div class="control-group">
	<label for="size" class="control-label">Size</label>
	<div class="controls">
	<input type="text" name="cost" value="${tire.size}"/>
	</div>
</div>

<div class="control-group">
	<label for="cost" class="control-label">Cost</label>
	<div class="controls">
	<input type="text" name="cost" value="${tire.cost}"/>
	</div>
	<button type="sumbit" class="btn btn-inverse controls">Submit</button>
	</div>
	</form>
<%@include file="footer.jsp" %>