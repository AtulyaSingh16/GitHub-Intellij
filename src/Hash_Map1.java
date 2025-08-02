//1.Employee ID to Name Mapping

import java.util.HashMap;

public class Hash_Map1 {
    public static void main(String[] args) {
        HashMap<Integer,String> employees= new HashMap<>();
        employees.put(101,"Rakesh");
        employees.put(102," Atulya");
        System.out.println("Employee 101 : "+employees.get(101));
    }
}
