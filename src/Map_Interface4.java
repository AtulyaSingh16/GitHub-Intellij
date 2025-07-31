//4.Checking Key Exhistance

import java.util.HashMap;
import java.util.Map;

public class Map_Interface4 {
    public static void main(String[] args) {
        Map<Integer,String> idToName= new HashMap<>();
        idToName.put(001,"Atulya singh");
        idToName.put(002,"Bob");
        idToName.put(003,"Alice");
        System.out.println("Has id 003 ? : "+idToName.containsKey(003));
    }
}
