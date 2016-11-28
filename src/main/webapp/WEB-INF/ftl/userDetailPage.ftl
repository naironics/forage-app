<#-- @ftlvariable name="user" type="com.naironics.forageapp.domain.User" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>User details</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-theme.min.css">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="jumbotron">
        <div class="alert alert-info">
            <center><h3>Forage User Details Page</h3></center>
        </div>
        <nav role="navigation">
            <a class="btn alert-info btn-block" href="/">Forage Home Page </a>
        </nav>
    </div>
</div>
<div class="container">
    <div class="table-responsive">
        <table class="table table-striped table-bordered table-hover table-condensed">
            <thead>
            <th>
                E-mail:
            </th>
            <th>
                Role:
            </th>
            </thead>
            <tr>
                <td> ${user.email}</td>
                <td>${user.role}</td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>