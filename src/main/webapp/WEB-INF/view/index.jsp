<%--
  Created by IntelliJ IDEA.
  User: 卢本伟的挂
  Date: 2020/11/27
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="show.go" method="post">
        品种：<select name="pack">
        <option value="0">--请选择--</option>
        <option value="1">狗</option>
        <option value="2">猫</option>
        <option value="3">鸟</option>
        <option value="4">兔</option>
    </select>
        <input type="submit" value="查询"><a href="show1.go">新增宠物</a>
    </form>


    <table border="1px">
        <tr>
            <td>宠物昵称</td>
            <td>出生日期</td>
            <td>性别</td>
        </tr>
        <c:forEach items="${pets}" var="pet">
            <tr>
                <td>${pet.petname}</td>
                <td><fmt:formatDate value="${pet.birthday}" type="date" pattern="yyyy-MM-dd"/></td>

                <td> <c:if test="${pet.petsex==1}">雌</c:if>
                <c:if test="${pet.petsex==2}">雄</c:if></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
