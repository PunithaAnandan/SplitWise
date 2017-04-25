<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="main">
<header>
    <div id="logo">
        <div id="logo_text">
            <h1><a href="index.jsp">SplitWise<span class="logo_six"></span></a></h1>
            <h2>Save past for the future</h2>
        </div>
    </div>
    <nav>
        <div id="menu_container">
            <ul class="sf-menu" id="nav">
                <li><a href="index.jsp">Home</a></li>
                <s:if test="#session.USER==null">
                    <li><s:a href="showSignUpAction">Sign Up</s:a></li>
                </s:if>
                <li><s:a href="showEnterExpensesAction">Enter Expenses</s:a></li>
                <li><s:a href="showViewExpensesAction">View Expense</s:a></li>
                <li><s:a href="showEditExpensesAction">Edit Expense</s:a></li>
                <li><a href="viewExpenseChart.jsp">Summary</a></li>
                <s:if test="#session.USER!=null">
                    <li><s:a href="signOutAction">Sign out</s:a></li>
                </s:if>
            </ul>
        </div>
    </nav>
</header>
