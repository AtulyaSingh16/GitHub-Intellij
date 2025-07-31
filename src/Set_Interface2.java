//removing duplicates from a list
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Interface2 {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>(List.of("Atulya","Bob","Atulya"));
        System.out.println("The items of list are : "+names);
        Set<String> unique_names= new HashSet<>(names);
        System.out.println("The unique names are : "+unique_names);
    }
}
