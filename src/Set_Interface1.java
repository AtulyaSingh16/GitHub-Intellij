//storing unique emails
import java.util.HashSet;
import java.util.Set;
public class Set_Interface1 {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        emails.add("atulya1684@gmail.com");
        emails.add("ananya1597@gmail.com");
        emails.add("mamta280472@gmail.com");
        emails.add("arayavi5566@gmail.com");
        emails.add("arayavi5566@gmail.com");//duplicate ignored
        System.out.println("the emails are : "+emails);
    }
}
