<%--
  Created by IntelliJ IDEA.
  User: Mery
  Date: 11/1/2018
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="adduser" method="post"  >

    <input type="submit" value="Add User"/>

</form>

<%if(request.getAttribute("message")!=null){%>
<span><%=request.getAttribute("message")%></span>
<%}%>
</body>
</html>
