<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈敬
  Date: 2017/3/1
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品分类列表</title>
</head>
<body>
<jsp:include page="common/top.jsp"></jsp:include>

<a href="/category/edit">新建</a>
<a href="detail?id=1">详情</a>
<a href="edit/1">修改</a>
<br>
1.测试声明标识
<%!
    String getDate(){
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }
%>
<div>
    当前时间：<%=getDate()%>
</div>
<br>

2.测试代码声明生命周期
<%!
    int n=0;

    /**
     * function:访问计数
     * @return 页面访问次数
     */
    int count(){
        n++;
        return n;
    }
%>
<div>刷新次数<%=count()%></div>
<br>

3.代码段
<%
    int n1=0;
    n1++;
%>
<div>n1=<%=n1%></div>
<br>

4.include和jsp:include
<%@include file="common/copyright.jsp"%>
<jsp:include page="common/copyright.jsp"></jsp:include>
<br>

5.jsp:forward
<%--<jsp:forward page="detail.jsp">--%>
<%--<jsp:param name="id" value="100"></jsp:param>--%>
<%--</jsp:forward>--%>
<br>

6.JavaBean当前页面设置和获取属性值
<div>
    <jsp:useBean id="category" class="com.cathy.domain.Category">
        <jsp:setProperty name="category" property="cateId" value="2"></jsp:setProperty>
        <jsp:setProperty name="category" property="cateName" value="女装"></jsp:setProperty>
    </jsp:useBean>
    <div>
        id:<jsp:getProperty name="category" property="cateId"></jsp:getProperty>
    </div>
    <div>
        name:<jsp:getProperty name="category" property="cateName"></jsp:getProperty>
    </div>
</div>

7.JavaBean访问计数
<jsp:useBean id="counter" class="com.cathy.bean.Counter" scope="application"></jsp:useBean>
<div>
    访问计数:<jsp:getProperty name="counter" property="total"></jsp:getProperty>
</div>
<br>


8.EL
<div>
    servername:${pageContext.request.serverName}<br>
    serverport:${pageContext.request.serverPort}
</div>

</body>
</html>
