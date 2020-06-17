<%--
  Created by IntelliJ IDEA.
  User: C
  Date: 2020/6/15
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查询界面</title>
</head>
<body>

<a href="/addUser.jsp">添加用户</a>
<table border="1px" style="width: 80%">
    <tr>
        <td>序号</td>
        <td>账户</td>
        <td>年龄</td>
        <td>性别</td>
        <td>工资</td>
        <td>出生日期</td>
        <td>操作</td>
    </tr>

    <c:forEach var="abc" items="${list}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${abc.account}</td>
            <td>${abc.age}</td>
            <td>${abc.sex}</td>
            <td>${abc.sal}</td>
            <td>${abc.birth}</td>
            <td><a href="/toUpdate?id=${abc.id}">修改</a>
                <a href="/delete?id=${abc.id}">删除</a>
            </td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
