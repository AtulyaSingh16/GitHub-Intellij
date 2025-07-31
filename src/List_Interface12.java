import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("the list is : "+list);
        //1. using for loop
        for(int i= 0;i<list.size();i++)
        {
            System.out.println("the element is : "+list.get(i));
        }
        System.out.println("\n");
        //2. using for each loop
        for(Integer element:list)
        {
            System.out.println("For each element is : "+element);
        }
        System.out.println("\n");
        //3. using iterator
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext())
        {
            System.out.println("iterator : "+iterator.next());
        }
    }
}
