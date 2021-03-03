<head>
<jsp:directive.include
	file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
<title>Login Successful</title>
</head>
<body>
	<div class="container-lg">
		<!-- Content here -->
		Login Successfully, Welcome <h3><%=session.getAttribute("inputEmail") %></h3> !
	</div>
</body>