<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<header class="fixed-top">
	<jsp:include page='header.jsp'/>
</header>
<div class="container mt-5">
	<h1>User Login</h1>
	<div class="col-md-6 col-md-offset-3">
		<form action="login" method="POST">
				
			<div class="form-group">
				<label for="uname">User Name: </label><input type="text" class="form-control" id="uname" placeholder="User Name" name="username" required>
			</div>
			
			<div class="form-group">
				<label for="pass">Password: </label><input type="password" class="form-control" id="pass" placeholder="Password" name="password" required>
			</div>
			
			<button type="submit" class="btn btn-primary">Login</button>
			
		</form>
	</div>
</div>
	
<footer class="d-inline bg-info fixed-bottom">
	<jsp:include page='footer.jsp'/>
</footer>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</html>