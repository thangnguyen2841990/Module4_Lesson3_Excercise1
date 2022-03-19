<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    a{
        text-decoration:none;
    }
</style>
<body>
<center>
    <h1>CUSTOMER MANAGEMENT</h1>
    <p>
        <a href="/customers/create">
            <button>Create new customer</button></a>
    </p>
    <table border="1" cellpadding="5">
        <capital><h2>CUSTOMER LIST</h2></capital>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>ADDRESS</th>
            <th colspan="2">ACTION</th>
        </tr>
       <c:forEach items="${requestScope['customers']}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td><a href="/customers/view/${customer.id}">${customer.name}</a></td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="/customers/edit/${customer.id}">
                    <button>Edit</button></a></td>
                <td><a href="/customers/delete/${customer.id}">
                    <button>Delete</button></a></td>
            </tr>
       </c:forEach>
    </table>
</center>

</body>
</html>
