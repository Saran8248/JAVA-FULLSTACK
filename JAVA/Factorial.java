import java.util.Scanner;
public  class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the fact number :");
        int fact = 1;

        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        System.out.println(n+fact);
    }
}