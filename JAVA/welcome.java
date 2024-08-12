import java.util.Scanner;
public class welcome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter yout id:");
        int a = scan.nextInt();

        System.out.println("engter your name :");
        String b = scan.next();

        System.out.println("Enter yout salary :");
        int c = scan.nextInt();

        System.out.println(" YOUR IS IS :" + a);
        System.out.println(" YOUR NAME IS  :" + b);
        System.out.println(" YOUR SALARY IS  :" + c);

    }
}