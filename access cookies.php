<!DOCTYPE html>
<html>
<head>
<title>Accessing Cookie with PHP</title>
</head>
<body>

<?php

if(isset($_COOKIE["name"])) {
    echo $_COOKIE["name"] . "<br>";
} else {
    echo "Name cookie is not set.<br>";
}
if(isset($_COOKIE["age"])) {
    echo  $_COOKIE["age"] . "<br>";
} else {
    echo "Age cookie is not set.<br>";
}
?>

</body>
</html>