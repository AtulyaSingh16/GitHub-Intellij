import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration1 {
    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>(List.of("A","B","C"));
        Iterator<String>iterator= list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
