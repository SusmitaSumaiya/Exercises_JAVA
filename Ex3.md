# Ex3: Relationships
![image](https://github.com/SusmitaSumaiya/Exercises_JAVA/assets/74201353/a535f5bb-a4a6-432a-a798-6256656be7b6)

**I)** Translate the given UML Diagram to the Java code. Data types and access modifiers are given. Methods should contain the implementation that is necessary for compilation. Please notice, that the relationships between classes have also an access modifier. The class Movie and the method getDuration() inside of Movie class should be declared as abstract so that it doesn't have to provide implementations for those abstract methods. 

**II)**	Change the definition of Duration in Movie class so, that it has a default value of 120 minutes.

**III)**	Please implement the constructors of all classes from UML diagram. Constructors should initialize all attributes of corresponding classes. The default values for Movies will be avaerageDuration and title if only a CinemaProgramm is initiated.

**IV)**	Please implement the methods addMovie(Movie) in CinemaProgramm class. The given parameter of the method should be added to the list of Movies in the CinemaProgramm but only if ProductionCompany budget of the Movie is greater than 50.000EUR. 

**V)**	Please implement the method getDuration() of Blockbuster and Comedy classes. The method should return following values: 

* Blockbuster – averageDuration + 20 minutes, if Blockbuster is a threeD, + 30 minutes, if Blockbuster has overlength
* Comedy – averageDuration + 30 minutes, if Comedy is withSuperStars.
* What are default values for Movies if only a CinemaProgramm is initiated?

**VI)**	Please implement the method getTotalDuration() in the CinemaProgramm class. It should give the sum of movie durations from movie list on the CinemaProgramm.

**VII)**	To test the getDuration() method in the Blockbuster class, create a JUnit test class named BlockbusterTest. In the setUp() method, instantiate two Blockbuster objects—one representing a movie that is over-length and not in 3D, and the other representing a movie that is regular-length and in 3D. Then, write two test methods: testGetDurationOverlengthNon3D() to verify the duration of an over-length, non-3D Blockbuster movie, and testGetDurationRegular3D() to verify the duration of a regular-length, 3D Blockbuster movie. Each test should assert that the getDuration() method returns the correct duration based on the specified attributes..

**VIII)**	Define the Test class for testing the getTotalDuration() method in the CinemaProgramm class. Prepare the test data in the setUp() method and write at least 2 test methods: 1st – with an empty list of movies and the 2nd – with the list of movies containing at least one movie.
