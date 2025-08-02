//5.Sorting dates

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Comparable5 {
    public static void main(String[] args) {
        ArrayList<Date>dates= new ArrayList<>();
        dates.add(new Date(2023 -1900,1 ,1));
        dates.add(new Date(2022 -1900,1 ,1));
        Collections.sort(dates);
        System.out.println("Sorted dates : "+dates);
    }
}
