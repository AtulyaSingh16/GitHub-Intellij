import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(List.of(30,10,20));
        Collections.sort(numbers);
        System.out.println("Sorted numbers : "+numbers);
    }
}
