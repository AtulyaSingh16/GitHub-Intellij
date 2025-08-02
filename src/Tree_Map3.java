//3.Range of Keys

import java.util.TreeMap;

public class Tree_Map3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(10,"Ten");
        map.put(20,"twenty");
        map.put(30,"Thirty");
        System.out.println("Key between 15-25 are : "+(map.subMap(15,25)));
    }
}
