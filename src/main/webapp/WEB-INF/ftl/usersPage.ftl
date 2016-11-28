<#-- @ftlvariable name="users" type="java.util.List<com.naironics.forageapp.domain.User>" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>List of Users</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-theme.min.css">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="jumbotron">
        <div class="alert alert-info">
            <center><h3>Forage App User List</h3></center>
        </div>
        <nav role="navigation">
            <a class="btn alert-info btn-block" href="/">Forage Home Page </a>
            <a class="btn alert-info btn-block" href="/user/create">Register User</a>
        </nav>
    </div>
</div>
<div class="container">
    <div class="table-responsive">
        <table class="table table-striped table-bordered table-hover table-condensed">
            <thead>
            <tr>
                <th>E-mail</th>
                <th>Role</th>
            </tr>
            </thead>
            <tbody>
            <#list users as user>
            <tr>
                <td><a href="/user/${user.id}">${user.email}</a></td>
                <td>${user.role}</td>
            </tr>
            </#list>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>