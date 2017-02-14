<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="head.jsp" />

<body>

<c:import url="header.jsp" />


<div id="content" align="center">

    <form action="signUpServlet">
        <table>
            <tr><td>First Name</td><td><input type="text" name="firstName" /></td></tr>
            <tr><td>Last Name</td><td><input type="text" name="lastName" /></td></tr>
            <tr><td>Enter password</td><td><input type="password" name="password" /></td></tr>
            <tr><td>E-Mail ID</td><td><input type="email" name="emailId" /></td></tr>
            <tr><td>&nbsp;</td><td><input type="submit" value="submit" ></td></tr>
        </table>

    </form>

</div>
</body>

