//sorting a list
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class List_Interface5 {
    public static void main(String[] args) {
        List<Integer> scores= new ArrayList<>();
        scores.add(88);
        scores.add(46);
        scores.add(32);
        scores.add(90);
        scores.add(78);
        Collections.sort(scores);
        System.out.println("The sorted scores are : "+scores);
    }
}
