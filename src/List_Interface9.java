//removing all items from the list
import java.util.ArrayList;
import java.util.List;
public class List_Interface9 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.clear();
        System.out.println(list);
    }
}
