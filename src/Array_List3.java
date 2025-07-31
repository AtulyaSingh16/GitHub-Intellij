//3. removing an element from the list
import java.util.ArrayList;

public class Array_List3 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.remove(2);
        numbers.remove(Integer.valueOf(4));
        System.out.println("list : "+numbers);
    }
}
