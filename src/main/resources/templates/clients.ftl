<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clients</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/lists.css">
</head>
<body>
<div class="board">
    <h3>List of clients</h3>

        <table class="table table-dark table-sm" style="width:40%" align="centre">
            <thead class="table-light">
            <th class="tdID">ID</th>
            <th>Surname</th>
            <th>Name</th>
            <th>Second Name</th>
            <th>Street</th>
            <th>telephone Number</th>
            <th>Delete</th>
            <th>Update</th>
            </thead>
            <#list clients as clients>
                <tr>
                    <td class="tdID">${clients.id}</td>
                    <td>${clients.surname}</td>
                    <td>${clients.name}</td>
                    <td>${clients.secondName}</td>
                    <td>${clients.street}</td>
                    <td>${clients.telephoneNumber}</td>
                    <td><button type="button" class="delete" onclick="window.location.href='/ui/clients/delete/${clients.id}'">Delete</button></td>
                    <td><button type="button" class="update" onclick="window.location.href='/ui/clients/update/${clients.id}'">Update</button></td>
                </tr>
            </#list>
        </table>
</div>
<div class="buttons">
    <button type="button" onclick="history.back()">back</button>
    <button type="button" onclick="window.location.href='/ui/clients/renew'">re new</button>
    <button type="button" class="create" onclick="window.location.href='/ui/clients/create'">Create</button>
</div>

</body>
</html>