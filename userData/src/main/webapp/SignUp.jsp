<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>SignUp Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Including the bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
<div class="container">
<div class="navabar-brand" class="nav-link" style="text-transform:uppercase;">
<img src="images/husky.jpg" width="100" height="60">
</div>
<div>
<ul class="nav navbar-nav navbar-right">
<li class = "nav-item-active"><a href="SignIn.jsp" class="nav-link">Sign-In</a></li>
<li class = "nav-item-active"><a href="index.jsp" class="nav-link">Home</a></li>
</ul>
</div>
</div>
</nav>
<div>
${mesg}<br>

The Enter UserName is:${DTO.userName}
<form action="user" method="post">
<h2>Enter User Details Below</h2><br>
<pre>
UserName:<input type="text" name="userName"/><br>
UserEmail:<input type="text" name="userEmail"/><br>
ContactInfo:<input type="text" name="contactInfo"/><br>
<br>
<input type="checkbox" name="Agreed" value="Terms And Conditions"><label for="Agreed">&nbsp I agree To Terms And Conditions</label><br>
<input type="submit" value="Submit"/>
</pre>
</form>
</div>
<div>
	<footer class="page-footer font-small blue">
		<!-- Copyright -->
		<div class="footer-copyright text-center py-3">
			© 2022 Sharath: <a href="index.jsp">Home</a>
		</div>
		<!-- Copyright -->
	</footer>
	</div>
</body>
</html>

