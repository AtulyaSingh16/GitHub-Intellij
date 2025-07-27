//null pointer error= mai basically if you are not entering
// any string value so it will give string length as 0 but
// we haven't entered any string so it should be null.
import java.util.Scanner;

public class ExceptionalHandling7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string (or press enter for null) : ");
        String string = input.nextLine();
        try{
            int length = string.length();
            System.out.println("Length : "+length);
        }
        catch(NullPointerException e)
        {
            System.out.println("Error : input is null");
        }
    }
}
