import java.util.HashSet;
import java.util.Set;

public class Set_Interface5 {
    public static void main(String[] args) {
        Set<Integer> set1= new HashSet<>(Set.of(1,2,3));
        System.out.println(set1);
        Set<Integer> set2= new HashSet<>(Set.of(4,5,6));
        System.out.println(set2);
        //union
        set1.addAll(set2);
        System.out.println("Union : "+set1);
    }
}
