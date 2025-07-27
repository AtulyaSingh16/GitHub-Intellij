//custom unchecked exception
import java.util.Scanner;
class InvalidNameException extends RuntimeException{
    public InvalidNameException(String message)
    {
        super(message);
    }
}
public class ExceptionalHandling11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        try{
            validateName(name);
            System.out.println("Name is Valid : "+name);
        }
        catch (InvalidNameException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }
        static void validateName(String name)
    {
        if(name==null || name.trim().isEmpty())
        {
            throw new InvalidNameException("Name cannot be empty.");
        }
    }
}
