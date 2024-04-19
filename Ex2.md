# Ex2: Classes & Objects

**I)** Implement a class named PongGame with public attributes Player1, Player2, and private attributes BallSpeed, BallDirection. Create an object called GameSession of the PongGame class and try to access all attributes.

Rules of the Pong Game:

*	The game involves two players, Player 1 and Player 2, each controlling a paddle on opposite sides of the screen.
*	A ball moves across the screen, bouncing off the walls and the paddles.
*	Player 1's paddle is controlled by the Up and Down arrow keys, while Player 2's paddle is controlled by the W and S keys.
*	The objective of the game is to prevent the ball from getting past your paddle while attempting to hit it past your opponent's paddle.
*	If the ball gets past a player's paddle, the opponent scores a point.
*	The game continues until one player reaches a predetermined score, typically 10 points, at which point they are declared the winner.

Your task is to implement the PongGame class with the given attributes and provide a main method to demonstrate accessing those attributes within an object of the class.

**II)** 	Create the class Student with the attributes StudentId, FirstName, LastName, Semester and Matriculation Number, Make sure to add validation for appropriate values.

**III)**	Create at least 2 different constructors, 1 default constructor with no parameters, 1 constructor with all the parameters.

**IV)**	Implement methods to access and modify student attributes like semester.

**V)**	Add the possibility to add a new student to the Student List and remove a student's name based on their StudentId.

**VI)**	Implement a counter for the StudentId, such as adding a new instance of Student will automatically set their id by increment.

**VII)**	Add the possibility to search for a student by their name and returns the first match.

**VIII)**	Write a Java program that simulates a student management system to display the details of a student. However, there might be cases where the student object is null. Your task is to modify the main method to handle the case where the student object is null. Ensure that the program gracefully handles this null reference and prints an appropriate message instead of crashing. Your solution should:

*	Check if the student object is null.
*	If the student object is not null, print the student details as usual.
*	If the student object is null, print a message such as "No student data available."
