<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Cars</title>
</head>
<body>
<center><h3>List of cars</h3></center>
<center>
    <table class="table table-dark table-sm" style="width:40%" align="centre">
        <thead class="table-light">
        <th>ID</th>
        <th>brand</th>
        <th>priceCar</th>
        <th>priceCarForRent</th>
        <th>type</th>
        <th>Delete</th>
        </thead>
        <#list cars as cars>
            <tr>
                <td>${cars.id}</td>
                <td>${cars.brand}</td>
                <td>${cars.priceCar}</td>
                <td>${cars.priceCarForRent}</td>
                <td>${cars.type}</td>
                <td><button><a href="/ui/car/delete/${cars.id}">Delete</a></button></td>
            </tr>
        </#list>
    </table>
</center>
<center><button><a href="/index.html">back</a></button></center>
<center><button><a href="/ui/car/renew">reNew</a></button></center>
</body>
</html>