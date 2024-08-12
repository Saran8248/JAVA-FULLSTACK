import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter the upper bound for a random integer: ");
        int upperBound = scanner.nextInt();
        System.out.println("Random Integer between 0 and " + upperBound + ": " + rand.nextInt(upperBound));
    }
}
