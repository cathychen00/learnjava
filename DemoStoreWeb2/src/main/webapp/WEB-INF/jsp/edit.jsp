
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
<jsp:include page="common/top.jsp"></jsp:include>
<div>
    测试jsp:useBean
    <form action="/category/detail" method="post">
        商品id:<input type="number" name="cateId">
        商品名称:<input type="text" name="cateName">
        <input type="submit" value="提交">
    </form>
    <jsp:useBean id="counter" class="com.cathy.bean.Counter" scope="application"></jsp:useBean>
    <div>访问计数:<jsp:getProperty name="counter" property="total"></jsp:getProperty></div>
</div>
<div>
    <form method="post" action="/category/save">
        <div>id:<input type="text" value="${cate.cateId}" name="cateId"></div>
        <div>name:<input type="text" value="${cate.cateName}" name="cateName"></div>
        <div><input type="submit" value="提交"></div>
    </form>
</div>
</body>
</html>
