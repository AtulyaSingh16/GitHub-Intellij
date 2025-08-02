//4.custom comparator

import java.util.Comparator;
import java.util.TreeMap;

public class Tree_Map4 {
    public static void main(String[] args) {
        TreeMap<String,Integer> map= new TreeMap<>(Comparator.reverseOrder());
        map.put("Apple",1);
        map.put("Banana",2);
        System.out.println("Reversed Sorted Map : "+map);
    }
}
