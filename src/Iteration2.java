//2.Removing During Iteration

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers= new ArrayList<>(List.of(1,2,3));
        Iterator<Integer> iterator= numbers.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next()==2)
            {
                iterator.remove();
            }
            System.out.println("Numbers : "+numbers);
        }
    }
}
