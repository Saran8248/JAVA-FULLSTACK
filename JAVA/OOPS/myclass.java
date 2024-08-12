package OOPS;

class data{
    int id = 0;
    String name ="";
    float salary = 0;

data(int id, String name, float salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
}

void display(){
    System.out.println("dataid" + id);
    System.out.println("name:" + name);
    System.out.println("float:" + salary);
}

}

public class myclass {

public static void main(String[] args) {

    data obj = new data();
    obj.id=11;
    obj.name="sarn";
    obj.salary = 40000;
    obj.display();

}

}
