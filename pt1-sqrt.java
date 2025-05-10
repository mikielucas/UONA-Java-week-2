import java.util.Scanner;

public class SimpleSquareRoot {
    public static void main(String[] args) {
        // Part 1: First 25 positive integers
        System.out.println("Square roots of first 25 integers:");
        for (int i = 1; i <= 25; i++) {
            System.out.println(i + ": " + Math.sqrt(i));
        }
        
        // Part 2: User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        double num = scanner.nextDouble();
        System.out.println("Square root of " + num + " is " + Math.sqrt(num));
        scanner.close();
    }
}
