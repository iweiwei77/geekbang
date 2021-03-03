<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>Login Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
	<div class="container">
		<form class="form-signin" method="POST" name="frmLogin" action="Servlet/FrontControllerServlet">
			<h1 class="h3 mb-3 font-weight-normal">LOGIN</h1>
			<label for="inputEmail" class="sr-only">Email</label> <input
				type="email" id="inputEmail" class="form-control"
				placeholder="sign in with your email" required autofocus> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="your password" required>
			<div class="checkbox mb-3">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
		</form>
	</div>

</body>