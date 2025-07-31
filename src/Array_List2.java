//2.updating an element...
import java.util.ArrayList;

public class Array_List2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add(1,"Litchi");//replacing Banana with Litchi
        System.out.println("Fruits : "+fruits);
    }
}
