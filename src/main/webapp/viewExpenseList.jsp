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
<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid black;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>

<body>

<c:import url="header.jsp" />
<!--Load the AJAX API-->
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">

    // Load the Visualization API and the corechart package.
    google.charts.load('current', {'packages':['corechart']});

    // Set a callback to run when the Google Visualization API is loaded.
    google.charts.setOnLoadCallback(drawChart);

    // Callback that creates and populates a data table,
    // instantiates the pie chart, passes in the data and
    // draws it.
    function drawChart() {

        // Create the data table.
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Expense');
        data.addColumn('number', 'Amount');
        data.addRows([
            <s:iterator value="expensesList" status="stat">
            ['<s:property value="expenseName" />', <s:property value="amountDue" />]<s:if test="!#stat.last">,</s:if>
            </s:iterator>
        ]);

        // Set chart options
        var options = {'title':'How Much Money I Spent',
            'width':500,
            'height':300};

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
        chart.draw(data, options);
    }
</script>

<p>
<div id="content" align="center">

    <h3>View Expenses List</h3>
    <table width="100%"><tr><td width="50%">
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
    </td>
        <td width="50%"><div id="chart_div"></div></td></tr></table>
</div>


<c:import url="footer.jsp" />

</body>
</html>


