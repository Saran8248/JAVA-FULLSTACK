package OOPS;

public class my {
    int b = 20;
    static int c = 30;

    public static void main(String[] args) {
        
        int a  = 10;
        System.out.println("variable :" + a);

        my obj = new my();
        System.out.println(obj.b);

        System.out.println(my.c);

    }
    
}
