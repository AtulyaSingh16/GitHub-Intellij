//1.Sorted Phonebook
import java.util.TreeMap;
public class Tree_Map1 {
    public static void main(String[] args) {
        TreeMap<String,String> phoneBook= new TreeMap<>();
        phoneBook.put("Bob","123-123");
        phoneBook.put("Alice","223-223");
        System.out.println("Phone book : "+phoneBook);
    }
}
