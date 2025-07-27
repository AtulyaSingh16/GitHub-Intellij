//custom exception with finally
import java.util.Scanner;
class LowBalanceException extends Exception{
    public LowBalanceException (String message)
    {
        super(message);
    }
}
public class ExceptionalHandling15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn : ");
        double amount = input.nextDouble();
        try
        {
            checkBalance(amount);
            System.out.println("withdrawal successful");
        }
        catch(LowBalanceException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally{
            System.out.println("Transaction completed ...");
        }
    }
    static void checkBalance (double amount)throws LowBalanceException
    {
        double balance = 100.0;
        if(amount>balance)
        {
            throw new LowBalanceException("Insufficient balance : "+balance);
        }
    }
}
