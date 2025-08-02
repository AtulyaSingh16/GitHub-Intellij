//2.first and last keys

import java.util.TreeMap;

public class Tree_Map2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(3,"Three");
        map.put(2,"Two");
        map.put(1,"One");
        System.out.println("Tree map : "+map);
        System.out.println("First Key : "+map.firstKey());
    }
}
