import java.util.HashMap;

public class Hash_Map5 {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        System.out.println("Has key 1 ? "+map.containsKey(1));
    }
}
