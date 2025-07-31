//removing the list items using index numbers
import java.util.ArrayList;
import java.util.List;
public class List_Interface7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("The original list is : "+list);
        list.remove(3);
        System.out.println("The updated list is : "+list);
    }
}
