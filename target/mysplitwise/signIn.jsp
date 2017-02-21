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

    <form action="/j_security_check" method="POST">
        <table>
            <tr><td>Email-Id</td><td><input type="text" name="j_username" /></td></tr>
            <tr><td>Password</td><td><input type="password" name="j_password" /></td></tr>
            <tr><td>&nbsp;</td><td><input type="submit" name="" value="Sign In" /></td></tr>
        </table>

    </form>

</div>


<c:import url="footer.jsp" />

</body>
</html>


