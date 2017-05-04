<%@ page import="java.util.List" %>
<%@ page import="edu.matc.entity.Expenses" %>
<%@ page import="java.util.ArrayList" %><%--
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
    <h3>Delete your expense</h3>
        <s:form action="deleteExpensesAction">
            <table class="table table-hover">
                <tr>
                    <s:textfield label="Expense Name" type="text" name="expenses.expenseName" />
                    <s:textfield label="Due Date" type="date" name="expenses.dueDate" />
                    <s:submit label="Delete" />
                </tr>
            </table>
        </s:form>

</div>
<c:import url="footer.jsp" />

</body>
</html>


