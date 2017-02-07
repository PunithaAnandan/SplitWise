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

<p>
<div id="content" align="center">

    <h3>Enter</h3>
    <form>
        <table>
            <tr><td>Select month :</td><td><input type="date" name="month" /></td></tr>
            <tr><td><input type="submit" name="" value="view" /></td><td><input type="submit" name="" value="Back to Menu" /></td></tr>
        </table>

    </form>

</div>
<c:import url="footer.jsp" />

</body>
</html>


