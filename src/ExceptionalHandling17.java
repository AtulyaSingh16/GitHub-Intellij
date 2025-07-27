import java.util.Scanner;
class InvalidEmailException extends Exception
{
    public InvalidEmailException (String message)
    {
        super(message);
    }
}
public class ExceptionalHandling17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email : ");
        String email = input.nextLine();
        try
        {
            validateEmail(email);
            System.out.println("Email id is valid !");
        }
        catch(InvalidEmailException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }
    static void validateEmail(String email)
    {
        if(email==null||!email.contains("@"))
        {
            throw new InvalidEmailException("Invalid email format ! ");
        }
    }
}
