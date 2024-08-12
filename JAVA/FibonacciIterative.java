import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;
        
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        
    }
}
