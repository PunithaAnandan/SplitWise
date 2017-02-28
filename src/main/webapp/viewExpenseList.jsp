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

<c:import url="head.jsp" />

<body>

<c:import url="header.jsp" />

<p>
<div id="content" align="center">

    <h3>View Expense List</h3>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Expense Name</th>
            <th>Amount Due</th>
            <th>Due Date</th>
            <th>Paid Date</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Expenses> expensesList = (ArrayList<Expenses>)request.getAttribute("expensesList");
            for(int i=0;i<expensesList.size();i++){
                Expenses expenses=(Expenses) expensesList.get(i);
        %>
        <tr><td><%=expenses.getExpense_name()%></td><td><%=expenses.getAmount_due()%></td><td><%=expenses.getDueDate()%></td><td><%=expenses.getPaidDate()%></td></tr>
        <%}

        %>

        </tbody>
    </table>
</div>
<c:import url="footer.jsp" />

</body>
</html>


