<%@ include file="header.jsp" %>
	<div class="container">
		<h2>Customer SignUp Page</h2>
	</div>
	
	<form method="post" action="SignUpServlet">
	<div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Enter Your Firstname</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="firstname" >
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Enter Your Lastname</label>
		    <input type="text" class="form-control" id="exampleInputPassword1" name="lastname">
		  </div>
	
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Enter A User Name</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="useremail" >
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Enter A Password</label>
		    <input type="text" class="form-control" id="exampleInputPassword1" name="userpassword">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form><br>
	
<%@ include file="footer.jsp" %>
