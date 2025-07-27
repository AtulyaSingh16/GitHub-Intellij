import java.util.Scanner;
public class ExceptionalHandling16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String string= input.nextLine();
        if(string.isEmpty())
        {
            string= null;
        }
        try
        {
            int number = Integer.parseInt(string);
            System.out.println("Result is : "+(100/number));
        }
        catch(NullPointerException e)
        {
            System.out.println("Error : Input is null !");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error : Division by zero ! ");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error : Invalid number format !");
        }
    }
}
