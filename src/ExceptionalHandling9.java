//handling number format exception
import java.util.Scanner;
public class ExceptionalHandling9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number as a string : ");
        String string = input.nextLine();
        try {
            System.out.println("Parsed number : "+(Integer.parseInt(string)));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error! Invalid number format !");
        }
    }
}
