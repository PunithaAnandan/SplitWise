<%--
  Created by IntelliJ IDEA.
  User: Punitha Anandan
  Date: 2/5/2017
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    function mydate()
    {
        //alert("");
        document.getElementById("dt").hidden=false;
        document.getElementById("ndt").hidden=true;
    }
    function mydate1()
    {
        d=new Date(document.getElementById("dt").value);
        dt=d.getDate();
        mn=d.getMonth();
        mn++;
        yy=d.getFullYear();
        document.getElementById("ndt").value=dt+"/"+mn+"/"+yy;
        document.getElementById("ndt").hidden=false;
        document.getElementById("dt").hidden=true;
    }
</script>

<c:import url="head.jsp" />

<c:import url="head.jsp" />

<body>

<c:import url="header.jsp" />

<div id="content" align="center">
    <p>
    <h3>Enter your expense</h3>
    <form action="/addExpenseServlet" method="post">
        <table class="table table-hover">

            <tr><td>Expense Name</td><td><input type="text" name="expense" /></td></tr>
            <tr><td>Amount</td><td><input type="number" name="amount" /></td></tr>
            <tr><td>Due Date</td><td><input type="DATE" name="dueDate" /></td></tr>
            <tr><td>Paid Date</td><td><input type="date" name="paidDate" /></td></tr>
        </table>
        <div>
            <table>
                <tr><td><input type="submit" name="" value="Add More" /></tr>
            </table>
        </div>

    </form>
    <a href="index.jsp">Back to Home</a>

</div>

<c:import url="footer.jsp" />

</body>
</html>


