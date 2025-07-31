//Iterating Over Entries
import java.util.HashMap;
import java.util.Map;
public class Map_Interface5 {
    public static void main(String[] args) {
        Map<String,Double> prices= new HashMap<>();
        prices.put("Apple",1.5);
        prices.put("Banana",0.5);
        for(Map.Entry<String,Double> entryo :prices.entrySet())
        {
            System.out.println(entryo.getKey()+" $ "+entryo.getValue());
        }
    }
}
