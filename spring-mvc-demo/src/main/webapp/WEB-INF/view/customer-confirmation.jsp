<%--
  Created by IntelliJ IDEA.
  User: bryan.lin
  Date: 18/06/2021
  Time: 3:00 pm
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
    The Customer is confirmed: ${customer.firstName}.${customer.lastName}

    <br><br>
    Free Passes: ${customer.freePasses}

    <br><br>
    Postal Code: ${customer.postalCode}

    <br><br>
    Course Code: ${customer.courseCode}
</body>
</html>


