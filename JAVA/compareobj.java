public class compareobj {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        if (str1 == str2) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("References point to different objects.");
        }
    }
}
