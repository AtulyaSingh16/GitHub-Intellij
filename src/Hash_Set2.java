//2.Filtering duplicates

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hash_Set2 {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>(List.of("Alice","Bob","Charles","Alice"));
        HashSet<String> uniqueNames= new HashSet<>(names);
        System.out.println("Unique names : "+uniqueNames);
    }
}
