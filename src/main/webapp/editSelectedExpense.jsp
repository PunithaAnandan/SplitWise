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
    <h3>Edit your expense</h3>
    <s:form action="editSelectedExpensesAction">
        <s:textfield label="Expense Name" type="text" name="expenses.expenseName" />
        <s:textfield label="Amount" type="decimal" name="expenses.amountDue" />
        <s:textfield label="Due Date" type="date" name="expenses.dueDate" />
        <s:textfield label="Paid Date" type="date" name="expenses.paidDate" />
        <s:hidden name="expenseName" value="%{expenses.expenseName}" />
        <s:hidden name="dueDate" value="%{expenses.dueDate}" />
        <s:submit value="Edit" />
    </s:form>
</div>

<c:import url="footer.jsp" />

</body>
</html>


