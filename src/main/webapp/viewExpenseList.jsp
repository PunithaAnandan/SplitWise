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

<p>
<div id="content" align="center">

    <h3>Expense List</h3>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Expense Name</th>
            <th>Amount Due</th>
            <th>Due Date</th>
            <th>Paid Date</th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        <s:iterator value="expensesList" >
            <tr>
                <td><s:property value="expenseName" /></td>
                <td><s:property value="amountDue" /></td>
                <td><s:property value="dueDate" /></td>
                <td><s:property value="paidDate" /></td>
                <td>
                    <s:url action="editExpensesAction.action" var="actionUrl">
                        <s:param name="expenseName"><s:property value="expenseName" /></s:param>
                        <s:param name="amountDue"><s:property value="amountDue" /></s:param>
                        <s:param name="dueDate"><s:property value="dueDate" /></s:param>
                        <s:param name="paidDate"><s:property value="paidDate" /></s:param>
                    </s:url>
                    <s:a href="%{actionUrl}">Edit</s:a>

                </td>
            </tr>
        </s:iterator>

        </tbody>
    </table>
</div>
<c:import url="footer.jsp" />

</body>
</html>


