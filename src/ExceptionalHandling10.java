//custom exception
import java.util.Scanner;
public class ExceptionalHandling10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        try{
            checkAge(age);
            System.out.println("Age is valid ");
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18)
        {
            throw new InvalidAgeException("Must be 18 or older.");
        }
    }
}
