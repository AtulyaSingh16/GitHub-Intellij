//managing a to-do list
import java.util.ArrayList;
import java.util.List;
public class List_Interface2 {
    public static void main(String[] args) {
        List<String>tasks=new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Complete homework");
        tasks.add("Eat lunch");
        System.out.println("List items : "+tasks);
    }
}
