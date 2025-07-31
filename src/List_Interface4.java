//inserting at specific position
import java.util.ArrayList;
import java.util.List;
public class List_Interface4 {
    public static void main(String[] args) {
        List<String> colors= new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add(2,"Yellow");
        System.out.println("Colors : "+colors);
    }
}
