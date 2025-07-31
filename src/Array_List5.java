//5. Clearing the list

import java.util.ArrayList;

public class Array_List5 {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Pen");
        objects.add("Notebook");
        objects.add("Bag");
        System.out.println("Items are : "+objects);
        objects.clear();
        System.out.println("Items list are : "+objects);
    }
}
