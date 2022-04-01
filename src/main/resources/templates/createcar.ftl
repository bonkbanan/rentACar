<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Car</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/form.css">
</head>
<body>
<center><h1>Create Car</h1></center>
<div>
    <fieldset>
        <form name="room" action="" method="POST">
            <div class="board">
                <h3>(If brand contains 2 or more words, write "_" between them)</h3>
                <h3>Brand : <@spring.formInput "cars.brand" "" "text"/></h3>
                <h3>Model : <@spring.formInput "cars.model" "" "text"/></h3>
                <h3>Price Car : <@spring.formInput "cars.priceCar" "" "text"/></h3>
                <h3>Price Car For Rent : <@spring.formInput "cars.priceCarForRent" "" "text"/></h3>
                <h3>Type : <@spring.formInput "cars.type" "" "text"/></h3>
            </div>
            <div class="buttons">
                <button type="button" onclick="history.back()">back</button>
                <input class="create" type="submit" value="Create"/>
            </div>
        </form>
    </fieldset>
</div>
</body>
</html>