//5. adding null element

import java.util.HashSet;

public class Hash_Set5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add(null);
        System.out.println("Set : "+set);
    }
}
