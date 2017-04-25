<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<c:import url="head.jsp" />

<body>

<c:import url="header.jsp" />


<div id="content" align="center">
    <p>
        <s:form action="signUpAction" >
            <s:bean name="edu.matc.entity.User" var="user">
                <s:textfield name="firstName" label="First Name"  type="text"  size="45" />
                <s:textfield  name="lastName" label="Last Name" type="text" size="45" />
                <s:password name="password" label="Enter password" type="password"  size="15" />
                <s:textfield name="emailId" label="E-Mail ID" type="email" size="45" />
                <s:submit />
            </s:bean>

        </s:form>
    </p>

</div>

<c:import url="footer.jsp" />
</body>

<style>
    table, tr, th, td {
        border: .1em solid black;
    }
</style>

