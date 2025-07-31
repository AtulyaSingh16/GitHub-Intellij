//1.storing student grades

import java.util.HashMap;
import java.util.Map;

public class Map_Interface1 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("Atulya",90);
        map.put("Ankit",78);
        map.put("Harsh",68);
        map.put("Ash",99);
        System.out.println("Ankit's grade : "+map.get("Ankit"));//trying to get the key.
    }
}
