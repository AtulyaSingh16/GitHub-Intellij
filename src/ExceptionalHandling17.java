import java.util.Scanner;
class InvalidEmailException extends Exception
{
    InvalidEmailException(String message)
    {
        super(message);
    }
}
public class ExceptionalHandling17
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email id : ");
        String email= input.nextLine();
        try
        {
            validateEmail(email);
            System.out.println("Email is valid : "+email);
        }
        catch (InvalidEmailException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }

    static void validateEmail(String email) throws InvalidEmailException
    {
        if(email==null||!email.contains("@"))
        {
            throw new InvalidEmailException("Invalid email format");
        }
    }
}
