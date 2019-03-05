<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<title>Save Customer</title>
</head>

<body>

<h3>Customer Registration Form</h3>

<form:form action="saveCustomer" modelAttribute="customer" method="post">

<!-- need to associate this data with customer id -->
			<form:input type="hidden" path="id" />

First Name:<form:input path="firstName"/>

<br><br>
Last Name:<form:input path="lastName"/>

<br><br>
Email:<form:input path="email"/>

<br><br>
User Id:<form:input path="userId"/>

<br><br>
Password:<form:input path="password"/>

<br><br>

<input type="Submit" value="Save" />

</form:form>

</body>

</html>