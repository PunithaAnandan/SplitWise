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
    <p>
    <h3>Select option</h3>
    <form action="CompareExpensesServlet">
        <table>
            <tr><td>Month</td><td><input type="radio" name="button" value="Month" checked>Month
                <input type="radio" name="button" value="Year">Year</td></tr>
            <tr><td><input type="submit" name="" value="Compare" /></td></tr>
        </table>

    </form>

</div>

<c:import url="footer.jsp" />

</body>
</html>


