import java.util.Scanner;

public class ASCI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.println("ASCII values of characters in the string:");
        
        for (char character : inputString.toCharArray()) {
            int asciiValue = (int) character;
            System.out.println("Character: '" + character + "' -> ASCII Value: " + asciiValue);
        }
    }
}
