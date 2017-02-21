<!DOCTYPE HTML>
<html>

<head>
    <title>CSS3_six</title>
    <meta name="description" content="website description" />
    <meta name="keywords" content="website keywords, website keywords" />
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <!-- modernizr enables HTML5 elements and feature detects -->
    <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
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
                        <li><a href="showSignUpServlet">Sign Up</a></li>
                        <li><a href="signInServlet">Sign In</a></li>
                        <li><a href="showEnterExpenseServlet">Enter Expenses</a></li>
                        <li><a href="showViewExpensesServlet">View Expense</a></li>
                        <li><a href="showEditExpenseServlet">Edit Expense</a></li>
                        <li><a href="compareExpensesServlet">Compare Expense</a></li>
                        <li><a href="signOutServlet">Sign out</a></li>
                    </ul>
                </div>
            </nav>

    </header>
    <div id="site_content">
           <h3>Problem Statement:</h3>
            <p>It's quite a hectic job to track your billing dates and monthly expenses and
                to keep that all in one place.
                we prefer to save it in a Excel sheet but anything happens to your computer,
                all your saved stuff will be lost.</strong>.</p>
           <h1>Problem Solution:</h1>
                <p>SplitWise maintains monthly expenses and tracks the due dates, paid dates of credit bills, insurance bills, and any monthly expenses.
                    SplitWise keeps all the important billing in one place, which is web based database maintained by SplitWise.</p>

            <p> This project keep all your expense details and notify you prior of month due date via E-Mail,
                and get your paid status from you and save it in your database. Whenever you wish to compare your expenses with
                your past month or past year it will give in a chart basis, and you will get a chance to know your average
                spending based on your monthly income which will helps to aware of your preceding month spending.  </strong>.</p>
    </div>
</div>
<p>&nbsp;</p>
<!-- javascript at the bottom for fast page loading -->
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
<script type="text/javascript" src="js/jquery.sooperfish.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('ul.sf-menu').sooperfish();
    });
</script>
</body>
</html>
