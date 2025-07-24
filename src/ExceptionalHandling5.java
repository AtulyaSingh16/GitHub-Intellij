import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionalHandling5 {
    public static void main(String[] args) {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            System.out.println("First Line : "+ line);
        }
        catch(IOException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }
}
