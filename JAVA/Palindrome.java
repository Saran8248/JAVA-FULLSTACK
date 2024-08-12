import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0, right = cleaned.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        System.out.println("'" + original + "' is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
        
        scanner.close();
    }
}
