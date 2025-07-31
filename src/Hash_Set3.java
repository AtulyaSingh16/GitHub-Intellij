//3.Fast Lookup

import java.util.HashSet;

public class Hash_Set3 {
    public static void main(String[] args) {
        HashSet<String> products= new HashSet<>();
        products.add("Laptop");
        System.out.println("Has Laptop ? : "+products.contains("Laptop"));
    }
}
