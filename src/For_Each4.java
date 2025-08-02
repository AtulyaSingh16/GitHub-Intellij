//4.Iterating map Entries

import java.util.HashMap;
import java.util.Map;

public class For_Each4 {
    public static void main(String[] args) {
        HashMap<String,Integer> scores= new HashMap<>();
        scores.put("Alice",85);
        scores.put("Bob",92);
        for(Map.Entry<String,Integer> entry : scores.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
