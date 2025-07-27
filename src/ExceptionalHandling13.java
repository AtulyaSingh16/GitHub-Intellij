import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ExceptionalHandling13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String fileName = input.nextLine();
        try{
            BufferedReader br= new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            System.out.println("First Line : "+line);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error : File not found ! ");
        }
        catch (IOException e)
        {
            System.out.println("Error : IO Exception ! ");
        }
    }
}
