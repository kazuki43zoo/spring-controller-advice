<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<body>
<h1>message : ${message}</h1>
<h2>common message for app package  : ${appCommonMessage}</h2>
<h2>common message for app1 package : ${app1CommonMessage}</h2>
<h3><a href="${pageContext.request.contextPath}/">Hello</a></h3>
</body>
</html>