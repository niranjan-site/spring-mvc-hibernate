<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="include.jsp"%>

<script type="text/javascript">	
</script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container cntr-new">
		<div class="row">
			<div class="col-md-12">
				<form:form id="loginForm" action="processLogin" modelAttribute="user" method="post">
					<form:label path="userId">User Name</form:label>
					<form:input path="userId" name="userId" id="userId"/><br>
					<form:label path="password">Password</form:label>
					<form:password path="password" name="password" id="password"/><br>
					<form:button name="login" id="login">Login</form:button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
