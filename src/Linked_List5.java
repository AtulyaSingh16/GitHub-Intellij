//5. using a deque

import java.util.LinkedList;

public class Linked_List5 {
    public static void main(String[] args) {
        LinkedList<String> deque= new LinkedList<>();
        deque.addFirst("A");
        deque.addLast("B");
        System.out.println(deque);
    }
}
