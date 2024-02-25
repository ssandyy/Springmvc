<%@page language="java" contentType="text/html; ISO-8859-1"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC >

<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>index Page</title>
</head>
<body>
	Welcome to the index page

	<form action="add">
		Enter 1st number: <input type="text" name="number1" /> </br> Enter 2nd
		number: <input type="text" name="number2" /></br> <input type="submit" /> <a
			href="/alien"> AddAlien</a>
	</form>


	<h3>Add new Alien in SpaceShip..!</h3>
	<form action="addalien">
		Enter alien Id: <input type="text" name="aid" /> </br> Enter alien name: <input
			type="text" name="name" /></br> Enter alien technology: <input type="text"
			name="technology" /></br> <input type="submit" />
	</form>
</body>
</html>