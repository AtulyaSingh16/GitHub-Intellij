//removing the element from the list by giving the value and not the index
import java.util.ArrayList;
import java.util.List;
public class List_Interface8 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.remove(Integer.valueOf(50));//remove method is being overloaded here
        System.out.println(list);
    }
}
