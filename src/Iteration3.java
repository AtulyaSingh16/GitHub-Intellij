//3.Iterating a Set

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteration3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Set.of("Apple","Banana"));
        Iterator<String>iterator=set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
