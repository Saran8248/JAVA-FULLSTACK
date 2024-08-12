import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int a[] = new int[4];
        int sum1 =0;
        int sum2 =0;
        int num =0;

        System.out.println("Enter the first value:");

        for(int i=1; i<a.length;i++){
            a[i] = scan.nextInt();
            sum1 = sum1 + a[i];
        }
        System.out.println("Enter the second value :" );
        for(int j=1; j<a.length;j++){
            a[j] = scan.nextInt();
            sum2 = sum2 + a[j];

            num =sum1 + sum2;
        }
        System.out.println("Total sum is :"+num);
    }
    
}
