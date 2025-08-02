//3.Null Key Handling

import java.util.HashMap;

public class Hash_Map3 {
    public static void main(String[] args) {
        HashMap<String,String> data = new HashMap<>();
        data.put(null,"unknown");
        data.put("key1",null);
        System.out.println("value for null key : "+data.get(null));
    }
}
