<%--
  Created by IntelliJ IDEA.
  User: Punitha Anandan
  Date: 2/5/2017
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<c:import url="head.jsp" />

<body>

<c:import url="header.jsp" />
<div id="content" align="center">
    <p>
    <h2>View your expense</h2>
    <s:form action="viewExpensesAction">
        <s:textfield label="Select due Date you wish to view :" name="expenses.dueDate" type="date"/>
        <s:submit value="View" />
    </s:form>
</div>
<c:import url="footer.jsp" />

</body>
</html>


