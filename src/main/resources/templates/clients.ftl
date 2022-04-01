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
    <h3 class="text">List of clients</h3>

        <table class="table table-dark table-sm" style="width:40%" align="centre">
            <thead class="table-light">
            <th class="tdID"><h5>ID</h5></th>
            <th class="text"><h5>Surname</h5></th>
            <th class="text"><h5>Name</h5></th>
            <th class="text"><h5>Second Name</h5></th>
            <th class="text"><h5>Street</h5></th>
            <th class="text"><h5>telephone Number</h5></th>
            <th class="text"><h5>Delete</h5></th>
            <th class="text"><h5>Update</h5></th>
            </thead>
            <#list clients as clients>
                <tr>
                    <td class="tdID"><h5>${clients.id}</h5></td>
                    <td class="text"><h5>${clients.surname}</h5></td>
                    <td class="text"><h5>${clients.name}</h5></td>
                    <td class="text"><h5>${clients.secondName}</h5></td>
                    <td class="text"><h5>${clients.street}</h5></td>
                    <td class="text"><h5>${clients.telephoneNumber}</h5></td>
                    <td class="text"><button type="button" class="delete" onclick="window.location.href='/ui/clients/delete/${clients.id}'">Delete</button></td>
                    <td class="text"><button type="button" class="update" onclick="window.location.href='/ui/clients/update/${clients.id}'">Update</button></td>
                </tr>
            </#list>
        </table>
</div>
<div class="buttons">
    <button type="button" onclick="window.location.href='/'">back</button>
    <button type="button" onclick="window.location.href='/ui/clients/renew'">re new</button>
    <button type="button" class="create" onclick="window.location.href='/ui/clients/create'">Create</button>
</div>

</body>
</html>