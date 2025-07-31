//4.sorted set with tree set

import java.util.Set;
import java.util.TreeSet;

public class Set_Interface4 {
    public static void main(String[] args) {
        Set<String>fruits= new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grapes");
        System.out.println("Sorted words : "+fruits);
    }
}
