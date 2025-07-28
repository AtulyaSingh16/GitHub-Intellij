import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ExceptionalHandling18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String name = input.nextLine();
        try{
            FileReader fr= new FileReader(name);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println("First line : "+line);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error : File not found ");
        }
        catch (IOException e)
        {
            System.out.println("Error : IO issue !");
        }
    }
}
