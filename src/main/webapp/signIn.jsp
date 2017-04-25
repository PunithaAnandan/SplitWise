<%--
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

<body>

<c:import url="header.jsp" />

<div id="content" align="center">
    <p>
    <s:form action="login" method="POST">
        <s:textfield name="emailId" label="Email-Id"/>
        <s:password name="password" label="Password"/>
        <s:submit value="Sign In" />
    </s:form>
    </p>
</div>


<c:import url="footer.jsp" />

</body>



