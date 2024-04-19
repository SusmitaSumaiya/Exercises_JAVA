package Example1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Print numbers from 0 to 10
        System.out.println("Numbers from 0 to 10:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print numbers up to 100 divisible by 7
        System.out.println("Numbers up to 100 divisible by 7:");
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Print text as often as defined by user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to be printed:");
        String text = scanner.nextLine();
        System.out.println("Enter the number of times to print the text:");
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }

        // Check if a year is a leap year
        System.out.println("Enter a year to check if it's a leap year:");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Check if a character is a vowel or consonant
        System.out.println("Enter a character to check if it's a vowel or consonant:");
        char ch = scanner.next().charAt(0);
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }

        // Sort an array of characters (Unicode)
        System.out.println("Enter the size of the character array:");
        int size = scanner.nextInt();
        char[] charArray = new char[size];
        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        System.out.println("Sorted array of characters:");
        java.util.Arrays.sort(charArray);
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Print the first 1000 prime numbers
        System.out.println("First 1000 prime numbers:");
        int count = 0;
        for (int i = 2; count < 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
