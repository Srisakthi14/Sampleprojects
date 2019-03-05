<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>

<title>Login Page</title>

<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css"/>
		  
		  <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
		  

</head>

<body>

<div id="wrapper">
		<div id="header">
			<h2>Customer Login Page</h2>
		</div>
	</div>

<form:form action="customerLogin" modelAttribute="customerlogin"  method="post">


<table>

<tr>
   <td> <label>User Id:</label> </td> 
   <td> <form:input path="userId" /> </td>
   
   </tr>
   <tr>
   
  <td><label> Password </label> </td>
  <td> <form:input path="password"/></td>
   
  </tr> 
   <tr>
   
  <td> <input type="Submit" value="Submit"> </td>
  
   
  </tr> 
   
</table>
</form:form>

</body>
</html>