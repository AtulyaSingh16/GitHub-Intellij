//3. adding at beginning

import java.util.LinkedList;

public class Linked_List3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.addFirst(5);
        System.out.println("Numbers : "+numbers );
    }
}
