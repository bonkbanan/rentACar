<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Clients</title>
</head>
<body>
<center><h3>List of clients</h3></center>
<center>
    <table class="table table-dark table-sm" style="width:40%" align="centre">
        <thead class="table-light">
        <th>ID</th>
        <th>Surname</th>
        <th>Name</th>
        <th>SecondName</th>
        <th>Street</th>
        <th>telephoneNumber</th>
        <th>Delete</th>
        <th>Update</th>
        </thead>
        <#list clients as clients>
            <tr>
                <td>${clients.id}</td>
                <td>${clients.surname}</td>
                <td>${clients.name}</td>
                <td>${clients.secondName}</td>
                <td>${clients.street}</td>
                <td>${clients.telephoneNumber}</td>
                <td><button type="button" class="btn btn-danger"><a href="/ui/clients/delete/${clients.id}">Delete</a></button></td>
                <td><button type="button" class="btn btn-success"><a href="/ui/clients/update/${clients.id}">Update</a></button></td>
            </tr>
        </#list>
    </table>
</center>
<center><button><a href="/index.html">back</a></button></center>
<center><button><a href="/ui/clients/renew">reNew</a></button></center>
<center><button><a href="/ui/clients/create">Create</a></button></center>
</body>
</html>