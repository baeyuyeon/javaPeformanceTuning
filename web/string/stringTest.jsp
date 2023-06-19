<%--
  Created by IntelliJ IDEA.
  User: 뀨뀨
  Date: 2023-06-19
  Time: 오후 2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <%
        final String aValue = "abcde";
        for (int i = 0; i < 10; i++) {
            String a = new String();
            StringBuffer b = new StringBuffer();
            StringBuilder c = new StringBuilder();
            for (int j = 0; j < 10000; j++) {
                a += aValue;
            }
            for (int j = 0; j < 10000; j++) {
                b.append(aValue);
            }
            String temp = b.toString();
            for (int j = 0; j < 10000; j++) {
                c.append(aValue);
            }
            String temp2 = c.toString();
        }
    %>
    OK
    <%=System.currentTimeMillis()%>
</body>
</html>
