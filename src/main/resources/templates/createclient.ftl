<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Crate Client</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/form.css">
</head>
<body>
<center><h1>Create Client</h1></center>
<div>
    <fieldset>
        <form name="room" action="" method="POST">
            <div class="board">
                <h3>Surname : <@spring.formInput "clients.surname" "" "text"/></h3>
                <h3>Name : <@spring.formInput "clients.name" "" "text"/></h3>
                <h3>Second Name : <@spring.formInput "clients.secondName" "" "text"/></h3>
                <h3>Street : <@spring.formInput "clients.street" "" "text"/></h3>
                <h3>Telephone Number : <@spring.formInput "clients.telephoneNumber" "" "text"/></h3>
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