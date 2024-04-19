import java.util.Scanner;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int oddCount = countOddIntegers(numbers);
        System.out.println("Number of odd integers: " + oddCount);
    }

    public static <T extends Number> int countOddIntegers(List<T> list) {
        int count = 0;
        for (T num : list) {
            if (num.intValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
