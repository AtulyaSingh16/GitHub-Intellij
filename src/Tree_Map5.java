import java.util.TreeMap;

public class Tree_Map5 {
    public static void main(String[] args) {
        TreeMap<String,Double> prices= new TreeMap<>();
        prices.put("Apple",1.5);
        prices.put("Apple",1.7);
        System.out.println("Apple price updated : "+prices.get("Apple"));
    }
}
