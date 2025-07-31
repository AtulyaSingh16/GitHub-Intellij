//4. range view

import java.util.TreeSet;

public class Tree_Set4 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(60);
        set.add(50);
        set.add(70);
        System.out.println("values between 50 to 100 : "+set.subSet(51,100));
    }
}
