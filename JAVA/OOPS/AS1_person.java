public class AS1_person {

    String name;
    int age = 0;

    public AS1_person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println( name+ "" + age);
    }

    public static void main(String[] args) {
        AS1_person obj1 = new AS1_person("saran",20);
        AS1_person obj2 = new AS1_person("mani",29);
        obj1.display();
        obj2.display();


    }
    
}
