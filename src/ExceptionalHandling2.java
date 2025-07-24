//file not found exception
import java.io.FileReader;
public class ExceptionalHandling2 {
    public static void main(String[] args) {
        try{
            FileReader fr= new FileReader("data.txt");
            System.out.println("File opened !");
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("File not found : "+e.getMessage());
        }
    }
}
