//arithmetic exception
import java.util.Scanner;

public class ExceptionalHandling6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to divide 100 by : ");
        int divisor = input.nextInt();
        try{
            int result= 100/divisor;
            System.out.println("The result is : "+result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("100 cannot be divided by zero ! ");
        }
    }
}
