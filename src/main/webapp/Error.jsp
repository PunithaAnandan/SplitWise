<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<c:import url="head.jsp" />

<body>

<c:import url="header.jsp" />

<div id="content" align="center">
    <p>
    <h4>The application has malfunctioned.</h4>

    <p>Please contact technical support with the following information:</p>

    <h4>Exception Name: <s:property value="exception" /> </h4>

    <h4>Exception Details: <s:property value="exceptionStack" /></h4>
</div>
<c:import url="footer.jsp" />

</body>



