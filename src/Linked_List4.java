//4. removing last element :

import java.util.LinkedList;

public class Linked_List4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.removeLast();
        System.out.println("colors : "+colors);
    }
}
