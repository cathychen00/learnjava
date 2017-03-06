<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@page isELIgnored="false" %>--%>
<div>欢迎，您是第 <%=application.getAttribute("count")%> 位访客</div>
<div>欢迎，您是第 ${applicationScope.get("count")} 位访客</div>
