<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>onRental</title>
</head>
<body>
<center><h3>List of cars on rental</h3></center>
<center>
    <table class="table table-dark table-sm" style="width:40%" align="centre">
        <thead class="table-light">
        <th>IDCar</th>
        <th>idClient</th>
        <th>brand</th>
        <th>dateRentStart</th>
        <th>dateRentEnd</th>
        <th>Delete</th>
        </thead>
        <#list onRental as onRental>
            <tr>
                <td>${onRental.idCar}</td>
                <td>${onRental.idClient}</td>
                <td>${onRental.brand}</td>
                <td>${onRental.dateRentStart}</td>
                <td>${onRental.dateRentEnd}</td>
                <td><button><a href="/ui/onrental/delete/${onRental.idCar}">Delete</a></button></td>
            </tr>
        </#list>
    </table>
</center>
<center><button><a href="/index.html">back</a></button></center>
<center><button><a href="/ui/onrental/renew">reNew</a></button></center>
</body>
</html>