import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        
        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");
        
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true; 
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}
