//exception propagation
import java.util.Scanner;
public class ExceptionalHandling14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to divide 50 by : ");
        int number = input.nextInt();
        try{
            processNumber(number);
            System.out.println("Processing complete. ");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }
    static void processNumber(int number)
    {
        divideNumber(number);
    }
    static void  divideNumber (int number)
    {
        int result = 50/number;
        System.out.println("Result : "+result);
    }
}
