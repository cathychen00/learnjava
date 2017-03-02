<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
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

<%
    int n1=0;
    n1++;
%>
<div>n1=<%=n1%></div>

<%@include file="copyright.jsp"%>
<jsp:include page="copyright.jsp"></jsp:include>

<jsp:forward page="detail.jsp">
    <jsp:param name="id" value="100"></jsp:param>
</jsp:forward>
</body>
</html>
