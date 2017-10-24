<%--
  Created by IntelliJ IDEA.
  User: Tony.Jaa
  Date: 2017/10/10
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index page</title>
  </head>
  <body>
  <h1>首页</h1>
  <form action="/user/signIn" method="post">
    用户名：<input type="text" name="username"placeholder="USERNAME"><br>
    密码：<input type="text" name="password" placeholder="PASSWORD"><br>
    <input type="submit" value="SIGN IN">
  </form>
  <p>${requestScope.message}</p>
  <a href="sign_up.jsp">SIGN UP</a>
  </body>
</html>
