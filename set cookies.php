<?php
// Setting cookies
setcookie("name", "john", time() + 3600, "/","",0);
setcookie("age", "36", time() + 3600, "/","",0); // 3600 seconds = 1 hour
?>
<html>
<head>
<title>Setting Cookie with PHP</title>
</head>
<body>

<?php
echo "Cookies have been set.";
?>

</body>
</html>
