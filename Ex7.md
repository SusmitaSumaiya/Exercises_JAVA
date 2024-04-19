# Ex7: Exceptions
**I)**	Write a Java program that attempts to divide two numbers and print the result and handle the division by zero error using try-catch-finally blocks. Ensure that the program prints an appropriate error message when division by zero occurs and always executes the finally block.

**II)**	Create a custom exception class named InvalidAgeException to handle scenarios where an age entered by the user is invalid. An age is considered invalid if it is less than 0 or greater than 120. Your task is to implement the InvalidAgeException class and use it in a program where the user is prompted to enter their age. If the age entered is invalid, throw the InvalidAgeException with an appropriate error message.

**III)**	Write a Java program that calculates the factorial of a given number. However, there might be cases where the input number is negative. Your task is to modify the program to throw an IllegalArgumentException if the input number is negative using the throw keyword. Additionally, update the main method to handle this exception using a try-catch block.

**IV)**	What will be the output of the following code? 

```sh
import java.util.ArrayList;
class GPAOutOfBoundsException extends Exception {
    public GPAOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private double GPA;

    public static int numOfStudents = 0;

    public Student(String name) {
        this.name = name;
        numOfStudents++;
    }

    public String toString() {
        return name + " " + GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) throws GPAOutOfBoundsException {
        if (GPA > 4 || GPA < 0) throw new GPAOutOfBoundsException("GPA should be between 0-4.");
        else this.GPA = GPA;
    }
}

public class MainClass {

    public static void method2(ArrayList<Student> list, Student[] array, int index) throws ArrayIndexOutOfBoundsException {
        list.add(array[index]);
    }

    public static double method1(ArrayList<Student> list, Student[] array) throws GPAOutOfBoundsException {
        double sum = 0;
        try {
            for (int i = 0; i <= array.length; i++) {
                method2(list, array, i);
                sum += array[i].getGPA();
            }
            System.out.println("Done copying array to array list.");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error occurred while accessing the array.");
            throw ex;
        } finally {
            System.out.println("Finalizing method1.");
        }
        return sum / Student.numOfStudents;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ahmed");
        students[1] = new Student("Sarah");
        students[2] = new Student("Noor");

        try {
            students[0].setGPA(3.8);
            students[1].setGPA(4.5); 
            students[2].setGPA(3.0);
        } catch (GPAOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList<Student> studentList = new ArrayList<>();
        try {
            System.out.println("Average students GPAs: " + method1(studentList, students));
        } catch (Exception ex) {
            System.out.println("A RuntimeException occurred.");
        }
        System.out.println(studentList);
    }
}

```
