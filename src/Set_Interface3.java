//3.checking membership
import java.util.HashSet;
import java.util.Set;
public class Set_Interface3 {
    public static void main(String[] args) {
        Set<Integer> set_list= new HashSet<>();
        set_list.add(101);
        set_list.add(102);
        set_list.add(103);
        System.out.println("Contains 101 ? : "+set_list.contains(101));
    }
}
