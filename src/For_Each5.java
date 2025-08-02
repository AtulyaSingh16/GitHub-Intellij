//5.processing a collection

import java.util.ArrayList;
import java.util.List;

public class For_Each5 {
    public static void main(String[] args) {
        ArrayList<Integer>values= new ArrayList<>(List.of(10,20,30));
        for (int value:values)
        {
            System.out.println("Double : "+value*2);
        }
    }
}