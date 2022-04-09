<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cars</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/lists.css">

</head>
<body>
<div class="board">
    <h3 class="text">List of cars</h3>
    <table class="table table-dark table-sm" style="width:40%" align="centre">
        <thead class="table-light">
        <th class="tdID"><h5>ID</h5></th>
        <th class="text"><h5>Brand</h5></th>
        <th class="text"><h5>Model</h5></th>
        <th class="text"><h5>Car Plate</h5></th>
        <th class="text"><h5>Price Car</h5></th>
        <th class="text"><h5>Price Car For Rent</h5></th>
        <th class="text"><h5>Type</h5></th>
        <th class="text"><h5>Delete</h5></th>
        <th class="text"><h5>Update</h5></th>
        </thead>
        <#list cars as cars>
            <tr>
                <td class="tdID">${cars.id}</td>
                <td><h5>${cars.brand}</h5></td>
                <td><h5>${cars.model}</h5></td>
                <td><h5>${cars.carPlate}</h5></td>
                <td class="text"><h5>${cars.priceCar}</h5></td>
                <td class="text"><h5>${cars.priceCarForRent}</h5></td>
                <td class="text"><h5>${cars.type}</h5></td>
                <td><button type="button" class="delete" onclick="window.location.href='/ui/car/delete/${cars.id}'">Delete</button></td>
                <td><button type="button" class="update" onclick="window.location.href='/ui/car/update/${cars.id}'">Update</button></td>

            </tr>
        </#list>
    </table>
</div>
<div class="buttons">
    <button type="button" onclick="history.back()">back</button>
    <button type="button" onclick="window.location.href='/ui/car/renew'">re new</button>
    <button type="button" class="create" onclick="window.location.href='/ui/car/create'">Create</button>
</div>
</body>
</html>