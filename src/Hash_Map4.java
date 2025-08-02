//4.removing a key
import java.util.HashMap;
public class Hash_Map4 {
    public static void main(String[] args) {
        HashMap<String,Double> prices= new HashMap<>();
        prices.put("Apple",1.5);
        prices.put("Banana",0.5);
        prices.remove("Apple");
        System.out.println("Prices : "+prices);
    }
}
