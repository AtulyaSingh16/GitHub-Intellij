//2.using a stack - lifo last in first out ...
import java.util.LinkedList;
public class Linked_List2 {
    public static void main(String[] args) {
        LinkedList<String> stack= new LinkedList<>();
        stack.push("Page 1");
        stack.push("Page 2");
        stack.pop();
        System.out.println("Top : "+stack);
    }
}
