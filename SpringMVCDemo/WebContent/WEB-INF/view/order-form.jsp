<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>Order Form</title>

</head>

<body>

<h3>Order Form</h3>

<form action="placeorder/" method="post">

<form:input type="hidden" path="${customerId}" />

Enter Product:<input type="text" value="product"/>

<br><br>
Enter Quantity:<input type="text" value="quantity"/>

<br><br>
Address:<input type="text" value="address"/>

<br><br>

<input type="Submit" value="Save"/>
</form>

</body>

</html>