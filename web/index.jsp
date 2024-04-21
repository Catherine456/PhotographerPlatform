<%--
  Created by IntelliJ IDEA.
  User: 10170
  Date: 2024/4/20
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="utf-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>测试</h2>
<p>创建学生用户信息</p>
<form action="${pageContext.request.contextPath}/register" method="post">
    账号：<input type="text" name="name"><br/>
    密码：<input type="text" name="age"><br/>
    <input type="submit" value="注册用户">
</form>
</body>
</html>