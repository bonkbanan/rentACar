<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>onRental</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/lists.css">
    <style>
        tr{width: 1000px;}
        .tdID{
            width: 130px;
            justify-content: start
        }
        .tdID button{
            margin: 0;
            width: 0px;
            background: transparent;
            border: transparent;
            font-family: sans-serif;
        }
        .tdID button:hover{
            width: 0;
            height: 28px;
        }
    </style>
</head>
<body>
<div class="board">
<h3>List of cars on rental</h3>

    <table class="table table-dark table-sm" style="width:40%" align="centre">
        <thead class="table-light">
        <th class="tdID">ID</th>
        <th class="tdID">idClient</th>
        <th class="tdID">idCar</th>
        <th>brand</th>
        <th>model</th>
        <th>date Rent Start</th>
        <th>date Rent End</th>
        <th>Delete</th>
        <th>Update</th>
        </thead>
        <#list onRental as onRental>
            <tr>
                <td class="tdID">${onRental.id}</td>
                <td class="tdID"><button type="button" onclick="window.location.href='/ui/clients/${onRental.clients.getId()}'">${onRental.clients.getId()}</button></td>
                <td class="tdID"><button type="button" onclick="window.location.href='/ui/car/${onRental.car.getId()}'">${onRental.car.getId()}</button></td>
                <td>${onRental.car.getBrand()}</td>
                <td>${onRental.car.getModel()}</td>
                <td>${onRental.dateRentStart}</td>
                <td>${onRental.dateRentEnd}</td>
                <td><button type="button" class="delete" onclick="window.location.href='/ui/onrental/delete/${onRental.id}'">Delete</button></td>
                <td><button type="button" class="update" onclick="window.location.href='/ui/onrental/update/${onRental.id}'">Update</button></td>
            </tr>
        </#list>
    </table>
</div>
<div class="buttons">
    <button type="button" onclick="history.back()">back</button>
    <button type="button" onclick="window.location.href='/ui/onrental/renew'">re new</button>
    <button type="button" class="create" onclick="window.location.href='/ui/onrental/create'">Create</button>
</div>
</body>
</html>