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
<%
//String emailId = (String) request.getSession().getAttribute("j_username");
%>
    <h3>Select</h3>
    <form action="viewExpensesServlet" method="post">
        <table>
            <tr><td>Select month :</td><td><label>
                <input type="date" name="month"/>
            </label></td></tr>
        </table>
        <div>
            <tr><td>&nbsp;</td><td><input type="submit" name="submit"/></td></tr>
        </div>

    </form>

</div>
<c:import url="footer.jsp" />

</body>
</html>


