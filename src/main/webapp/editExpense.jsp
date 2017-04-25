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
    <h3>Edit Expense</h3>
    <s:form action="editExpensesAction">
        <tr>
            <s:textfield label="Expense Name" type="text" name="expenses.expenseName" />
            <s:submit label="Edit" />
        </tr>
    </s:form>
</div>
<c:import url="footer.jsp" />

</body>
</html>


