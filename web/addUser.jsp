<%--
  Created by IntelliJ IDEA.
  User: C
  Date: 2020/6/15
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<form action="/addUser" method="post">
    账号：<input type="text" name="account"><br/><br/>
    密码：<input type="password" name="password"><br/><br/>
    年龄：<input type="text" name="age"><br/><br/>
    性别：<input type="radio" name="sex" value="1">男
          <input type="radio" name="sex" value="0">女<br/><br/>
    工资：<input type="text" name="sal"><br/><br/>
    出生日期：<input type="date" name="birth"><br/><br/>
    <input type="submit" value="保存">
    <input type="reset" value="重置">
</form>
</body>
</html>
