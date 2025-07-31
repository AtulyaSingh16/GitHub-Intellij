//  adding two list items to each other
import java.util.ArrayList;
import java.util.List;
public class List_Interface6 {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("The first list item is : "+list1);
        List<Integer>list2= new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println("The first list item is : "+list2);
        list1.addAll(list2);//adds list 2 items in list1
        System.out.println("new list is : "+list1);
    }
}
