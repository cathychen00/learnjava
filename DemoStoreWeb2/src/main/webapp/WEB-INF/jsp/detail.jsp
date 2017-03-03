<%--
  Created by IntelliJ IDEA.
  User: 陈敬
  Date: 2017/2/16
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <jsp:include page="common/top.jsp"></jsp:include>
    <%request.setCharacterEncoding("UTF-8");%>
    <jsp:useBean id="category" class="com.cathy.domain.Category">
        <jsp:setProperty name="category" property="*"></jsp:setProperty>
    </jsp:useBean>
    <table>
        <tr>
            <td>id:</td><td><jsp:getProperty name="category" property="cateId"></jsp:getProperty></td>
        </tr>
        <tr><td>名称：</td><td><jsp:getProperty name="category" property="cateName"></jsp:getProperty></td></tr>
    </table>
</div>
</body>
</html>
