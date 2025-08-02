//4.List Iterator for bidirectional Traversal

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iteration4 {
    public static void main(String[] args) {
        LinkedList<String>list= new LinkedList<>(List.of("A","B","C"));
        ListIterator<String> iterator= list.listIterator(list.size());
        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
}
