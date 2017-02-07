<%--
  Created by IntelliJ IDEA.
  User: Punitha Anandan
  Date: 2/5/2017
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>


<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="head.jsp" />

<body>

<c:import url="header.jsp" />


<div id="content" align="center">

    <form action="/mainMenuServlet">
        <table>
            <tr><td>User Name</td><td><input type="text" name="firstName" /></td></tr>
            <tr><td>Password</td><td><input type="password" name="password" /></td></tr>
            <tr><td><input type="submit" name="" value="Sign In" /></td><td><input type="submit" name="" value="Sign Up" /></td></tr>
        </table>

    </form>

</div>


<c:import url="footer.jsp" />

</body>
</html>


