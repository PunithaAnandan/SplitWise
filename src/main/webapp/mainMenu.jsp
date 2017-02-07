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


<div id="content">
    <p>

    <ul>
        <li><a href="/enterExpensesServlet">Enter your expenses</a></li>
        <li><a href="viewExpense.jsp">View your expenses</a></li>
        <li><a href="editExpense.jsp">Edit your expenses</a></li>
        <li><a href="compareYearOrMonth.jsp">Compare your expenses</a></li>
        <li><a href="viewProfile.jsp">View your expenses</a></li>
    </ul>

    <a href="main.jsp">Back to Home</a></li>
</div>

<c:import url="footer.jsp" />
</body>
</html>


