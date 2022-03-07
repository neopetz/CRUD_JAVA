<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<header class="fixed-top">
	<jsp:include page='header.jsp'/>
</header>
<div class="container mt-5">
	<h1>User Registration</h1>
	<div class="col-md-6 col-md-offset-3">
	<div class="alert alert-success center" role="alert">
		<p>${NOTIFICATION}</p>
	</div>
		<form action="register" method="POST">	
			
			<div class="form-group">
				<label for="fname">First Name: </label><input type="text" class="form-control" id="fname" placeholder="First Name" name="firstname" required>
			</div>
			
			<div class="form-group">
				<label for="lname">Last Name: </label><input type="text" class="form-control" id="lname" placeholder="Last Name" name="lastname" required>
			</div>
			
			<div class="form-group">
				<label for="uname">User Name: </label><input type="text" class="form-control" id="uname" placeholder="User Name" name="username" required>
			</div>
			
			<div class="form-group">
				<label for="pass">Password: </label><input type="password" class="form-control" id="pass" placeholder="Password" name="password" required>
			</div>
			
			<button type="submit" class="btn btn-primary">Register</button>
			
		</form>
	</div>
</div>

<footer class="d-inline bg-info fixed-bottom">
	<jsp:include page='footer.jsp'/>
</footer>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</html>