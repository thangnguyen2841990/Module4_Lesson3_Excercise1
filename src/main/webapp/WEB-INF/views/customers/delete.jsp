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
        <a href="/customers">
            <button>Back to customer list</button></a>
    </p>
    <form method="post">
        <table border="1" cellpadding="5">
            <capital><h2>DELETE CUSTOMER</h2></capital>
            <tr>
                <td>ID: </td>
                <td><input type="text" name="id" disabled value="${customer.id}"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name"disabled value="${customer.name}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" disabled value="${customer.email}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" disabled value="${customer.address}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete"></td>
            </tr>

        </table>
    </form>
</center>

</body>
</html>



