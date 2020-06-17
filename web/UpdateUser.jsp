<%--
  Created by IntelliJ IDEA.
  User: C
  Date: 2020/6/15
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<form action="/Update" method="post">
    <input type="hidden" name="id" value="${user.id} "><br/><br/>
    账号：<input type="text" name="account" value="${user.account}"><br/><br/>
    密码：<input type="password" name="password" value="${user.password}"><br/><br/>
    年龄：<input type="text" name="age" value="${user.age}"><br/><br/>
    性别：<input type="radio" name="sex" value="1" <c:if test="${user.sex==1}">checked</c:if> >男
          <input type="radio" name="sex" value="0" <c:if test="${user.sex==0}">checked</c:if>>女<br/><br/>
    工资：<input type="text" name="sal" value="${user.sal}"><br/><br/>
    出生日期：<input type="date" name="birth" value="${user.birth}"><br/><br/>
    <input type="submit" value="保存">
    <input type="reset" value="重置">
</form>
</body>
</html>
