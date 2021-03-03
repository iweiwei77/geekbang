<head>
<jsp:directive.include
	file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
<title>Login Failed</title>
</head>
<body>
<%
    String userName = (String) session.getAttribute("username");
    String msg = (String) session.getAttribute("inputEmail");
%>
	<div class="container-lg">
		<!-- Content here -->
		Login Failed, Please check your email and password!
	</div>
<%
    response.setHeader("Refresh", "5;URL=/login-form.jsp");
%>	
</body>