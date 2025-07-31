//3.First and Last Element

import java.util.TreeSet;

public class Tree_Set3 {
    public static void main(String[] args) {
        TreeSet<Integer> scores= new TreeSet<>();
        scores.add(99);
        scores.add(78);
        scores.add(87);
        scores.add(45);
        System.out.println("Highest score : "+scores.last());
    }
}
