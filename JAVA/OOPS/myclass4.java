public class myclass4 {
    void mymethod(String name){
        System.out.println("welcome" + name);
    }

    void mymethod(int a , int b){
        System.out.println("Addition" + (a+b));

    }

    void mymethod(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
            System.out.println("factorial:" + fact);
        }

    }

    public static void main(String[] args) {
        myclass4 obj =  new myclass4();
        obj.mymethod(5);
        obj.mymethod("saran");
        obj.mymethod(10,20);
    }
}
