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

<body>

<c:import url="header.jsp" />

<div id="content" align="center">
    <p>
    <h3>Enter your expense</h3>
    <form>
        <table border="1" width="500">
            <tr><th>Your Expense</th><th>Amount</th><th>Due Date</th><th>Paid Date</th></tr>
            <tr><td>Electricity Bill</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Phone Bill</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Internet Bill</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Credit Card1</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Credit Card2</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Credit Card3</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Insurance1</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Insurance2</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
            <tr><td>Insurance3</td><td><input type="number" name="amount" value="amount" /><td><input type="date" name="date1" /></td><td><input type="date" name="date1" /></td></tr>
        </table>
        <div>
            <td><input type="submit" name="" value="Back to Home" /></td><td>&nbsp;</td><td><input type="submit" name="" value="submit" /></td>
        </div>

    </form>

</div>

<c:import url="footer.jsp" />

</body>
</html>


