<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Update Client</title>
</head>
<body>
<center><h1>Update Client</h1></center>
<div>
    <fieldset>
        <form name="room" action="" method="POST">
            Surname : <@spring.formInput "clients.surname" "" "text"/>
            <br>
            Name : <@spring.formInput "clients.name" "" "text"/>
            <br>
            Second Name : <@spring.formInput "clients.secondName" "" "text"/>
            <br>
            Street : <@spring.formInput "clients.street" "" "text"/>
            <br>
            Telephone Number : <@spring.formInput "clients.telephoneNumber" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>
</body>
</html>