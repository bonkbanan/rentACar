<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Crate On Rental</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/form.css">
</head>
<body>
<center><h1>Create On Rental</h1></center>
<div>
    <fieldset>
        <form name="room" action="" method="POST">
            <div class="board">
                <h3>Car Id : <@spring.formInput "onRental.carId" "" "text"/></h3>
                <h3>Client Id : <@spring.formInput "onRental.clientsId" "" "text"/></h3>
                <h3>Date Rent Start : <@spring.formInput "onRental.dateRentStart" "" "text"/>(day/month/year)</h3>
                <h3>Date Rent End : <@spring.formInput "onRental.dateRentEnd" "" "text"/>(day/month/year)</h3>
            </div>
            <div class="buttons">
                <button type="button" onclick="history.back()">back</button>
                <input type="submit" class="create" value="Create"/>
            </div>
        </form>
    </fieldset>
</div>
</body>
</html>