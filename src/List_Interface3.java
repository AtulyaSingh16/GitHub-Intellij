//accessing elements by index
import java.util.ArrayList;
import java.util.List;
public class List_Interface3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("the list item at index 2 is : "+numbers.get(2));
    }
}
