<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>Home Page</title>
</head>

<body>



<h3>Welcome ${customer.firstName} </h3>


					

<table>


<tr><td><a href="${pageContext.request.contextPath}/api/orders">List Orders</a></td></tr>

</table>
</body>

</html>