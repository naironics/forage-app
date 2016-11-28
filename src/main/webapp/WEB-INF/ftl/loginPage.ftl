<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-theme.min.css">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <style type="text/css">
        .bs-example {
            margin: 20px;
        }
    </style>
    <title>Log in</title>
</head>
<body>
<div>
    <div class="alert alert-info">
        <center><h3>Forage Log in</h3></center>
    </div>

</div>
<#if error.isPresent()>
<div class="alert-danger">
    <p>Invalid Email or Password </p>
</div>
</#if>
<div class="example">
    <div class="container">
        <div class="jumbotron">
            <form role="form" action="/login" method="post">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <div class="alert alert-info">
                    <center><p>Forage Default Credential: naironics@forageapp.com / naironics@forage </p></center>
                </div>
                <nav role="navigation">
                    <a class="btn alert-info btn-block" href="/">Forage Home Page </a>
                </nav>
                <div class="form-group">
                    <label for="email">Email address</label>
                    <input type="email" class="form-control" name="email" id="email" required autofocus
                           placeholder="Email"/>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" required class="form-control"
                           placeholder="Password"/>
                </div
                <div class="checkbox">
                    <label><input type="checkbox" name="remember-me" id="remember-me"> Remember me</label>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Login</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>