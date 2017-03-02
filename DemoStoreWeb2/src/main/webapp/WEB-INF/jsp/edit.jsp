
<%--
  Created by IntelliJ IDEA.
  User: 陈敬
  Date: 2017/2/16
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/category/detail" method="post">
    商品id:<input type="number" name="cateId">
    商品名称:<input type="text" name="cateName">
    <input type="submit" value="提交">
</form>
<jsp:useBean id="counter" class="com.cathy.domain.Counter" scope="application"></jsp:useBean>
<div>访问计数:<jsp:getProperty name="counter" property="total"></jsp:getProperty></div>
</body>
</html>
