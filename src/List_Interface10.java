//updating a value in a list using set function
import java.util.ArrayList;
import java.util.List;
public class List_Interface10 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("list is : "+list);
        list.set(2,56);
        System.out.println("New list is : "+list);
    }
}
