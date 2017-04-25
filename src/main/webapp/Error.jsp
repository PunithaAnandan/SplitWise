<%--
  Created by IntelliJ IDEA.
  User: Punitha Anandan
  Date: 2/5/2017
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>


<!DOCTYPE html>

<%@ taglib prefix="s" uri="/struts-tags" %>

<body>

<div id="content" align="center">
    <h4>The application has malfunctioned.</h4>

    <p>Please contact technical support with the following information:</p>

    <h4>Exception Name: <s:property value="exception" /> </h4>

    <h4>Exception Details: <s:property value="exceptionStack" /></h4>
</div>


</body>



