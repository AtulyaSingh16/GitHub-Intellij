import java.util.ArrayList;
import java.util.List;

public class For_Each1 {
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>(List.of("Apple","Banana"));
        for(String fruit:fruits)
        {
            System.out.println(fruit);
        }
    }
}
