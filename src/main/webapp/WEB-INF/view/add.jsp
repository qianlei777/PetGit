<%--
  Created by IntelliJ IDEA.
  User: 84911
  Date: 2020/11/27
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加宠物</title>
</head>
<body>
<h1>宠物的基本信息</h1>

<form action="/addpet.go" method="post">
    <p>昵称：
        <input name="petname">
    </p>
    <p>
        <select name="petbreed">
            <option value="0">--请选择--</option>
            <option value="1">狗</option>
            <option value="2">猫</option>
            <option value="3">鸟</option>
            <option value="4">兔</option>
        </select>
    </p>
    <p>
        <input type="radio" checked value="1" name="petsex">雄
        <input type="radio" name="petsex" value="2">雌
    </p>
    <p>出生日期：
        <input name="birthday">
    </p>
    <p>
        <textarea rows="6" cols="6" name="description"></textarea>
    </p>
    <p>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </p>
</form>
</body>
</html>
