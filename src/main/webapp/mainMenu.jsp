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

    <br><h2><a href="/enterExpensesServlet">Enter your expenses</a></h2>
    <br><h2><a href="viewExpense.jsp">View your expenses</a></h2>
    <br><h2><a href="editExpense.jsp">Edit your expenses</a></h2>
    <br><h2><a href="compareYearOrMonth.jsp">Compare your expenses</a></h2>
    <br><h2><a href="viewProfile.jsp">View your expenses</a></h2>
         <a href="main.jsp">Back to Home</a>
</div>

<c:import url="footer.jsp" />
</body>
</html>


