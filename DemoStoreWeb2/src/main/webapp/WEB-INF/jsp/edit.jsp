
<%--
  Created by IntelliJ IDEA.
  User: 陈敬
  Date: 2017/2/16
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
    提交表单
    <form method="post" action="/category/save">
        <div>id:<input type="text" value="${cate.cateId}" name="cateId"></div>
        <div>name:<input type="text" value="${cate.cateName}" name="cateName"></div>
        <div><input type="submit" value="提交"></div>
    </form>
</div>
<div>
    spring form
    <sf:form method="post" action="/category/save" commandName="cate">
        <sf:errors path="*" element="div"></sf:errors>
        <div>
            id:<sf:input path="cateId"></sf:input>
            <sf:errors path="cateId"></sf:errors>
        </div>
        <div>
            name:<sf:input path="cateName"></sf:input>
            <sf:errors path="cateName"></sf:errors>
        </div>
        <div>
            <input type="submit" value="提交">
        </div>
    </sf:form>
</div>


</body>
</html>
