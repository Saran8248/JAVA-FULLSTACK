
public class myclass3 {
    void MyMethod1(){
        System.out.println("saran ");
    }

    static void MyMethod2(){
        System.out.println(" om");
    }


    public static void main(String[] args) {
        myclass3 obj = new myclass3();
        obj.MyMethod1();
        
        myclass3.MyMethod2();
    }
}
