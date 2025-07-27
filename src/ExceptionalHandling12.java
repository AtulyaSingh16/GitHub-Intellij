//multiple catch block
import java.util.Scanner;
public class ExceptionalHandling12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to divide 100 by : ");
        String num= input.nextLine();
        try{
            int number = Integer.parseInt(num);
            System.out.println("Result : "+(100/number));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error : invalid number format ");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : Arithmetic Exception, cannot be divided by 0");
        }
    }
}
