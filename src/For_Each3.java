//3.iterating a set

import java.util.HashSet;
import java.util.Set;

public class For_Each3 {
    public static void main(String[] args) {
        HashSet<String>colors=new HashSet<>(Set.of("Red","Blue"));
        for(String color:colors)
        {
            System.out.println(color);
        }
    }
}
