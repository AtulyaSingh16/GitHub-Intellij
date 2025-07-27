//finally block
import java.util.Scanner;
public class ExceptionalHandling8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to divide 50 by : ");
        int divisor = input.nextInt();
        try{
            System.out.println("Result : "+(50/divisor));
        }
        catch(ArithmeticException e)
        {
            System.out.println("error : division by zero is not possible");
        }
        finally {
            System.out.println("operation completed");
        }
    }
}
