//4. Intersection of Sets

import java.util.HashSet;
import java.util.Set;

public class Hash_Set4 {
    public static void main(String[] args) {
        HashSet<Integer>set1= new HashSet<>(Set.of(1,2,3));
        HashSet<Integer>set2= new HashSet<>(Set.of(5,2,3));
        set1.retainAll(set2);
        System.out.println("Intersection : "+set1);
    }
}
