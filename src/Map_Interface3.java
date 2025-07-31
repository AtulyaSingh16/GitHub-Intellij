//3. sorted map with TreeMap
import java.util.Map;
import java.util.TreeMap;

public class Map_Interface3 {
    public static void main(String[] args) {
        Map<String,String> map= new TreeMap();
        map.put("Bob","123-466");
        map.put("Alice","334-667");
        System.out.println("Phone Book : "+map);
    }
}
