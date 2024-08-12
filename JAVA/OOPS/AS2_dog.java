public class AS2_dog {

    String name = "";
     String bread = "";

    public AS2_dog(String name, String bread){
        this.name = name;
        this.bread  = bread;
    }

    public String getname(String string){
        return name;
    }
    public String setname(String name){
        return this.name = name;
    }
    public String getbread(){
        return bread;
    }
    public String setbread(String bread){
        return this.bread = bread;
    }

    

    public void display(){
        System.out.println(name +  " " + bread);
    }

    public static void main(String[] args) {
        AS2_dog obj1 = new AS2_dog("saraaa","pitbul");
        AS2_dog obj2 = new AS2_dog("elsaa", "pomerian");

        obj1.display();
        obj2.display();

        obj1.setname("varsha");
        obj1.setbread("manika");
        obj2.getname("kesa");
        obj2.getbread();

        obj1.display();
        obj2.display();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

}

