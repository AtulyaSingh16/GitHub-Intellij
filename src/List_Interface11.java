//contains to check if the element is present or not in the list item
import java.util.ArrayList;
import java.util.List;
public class List_Interface11 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.contains(66));
    }
}
