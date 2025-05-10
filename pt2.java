import java.util.Scanner;

public class SimpleCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();
        
        // Check prime
        boolean prime = true;
        if (num <= 1) prime = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        
        // Check palindrome
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        boolean palindrome = (num == reverse);
        
        // Print results
        System.out.println(num + " is " + (prime ? "a prime" : "not a prime"));
        System.out.println(num + " is " + (palindrome ? "a palindrome" : "not a palindrome"));
        
        scan.close();
    }
}
