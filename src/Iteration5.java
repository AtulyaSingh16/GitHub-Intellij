//5.Modifying with list iterator

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iteration5 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(List.of("A","B","C"));
        ListIterator<String> iterator= list.listIterator();
        while(iterator.hasNext())
        {
            if(iterator.next().equals("B"))
            {
                iterator.set("X");
            }
        }
        System.out.println("List : "+list);
    }
}
