//3. null pointer exception
public class ExceptionalHandling3 {
    public static void main(String[] args) {
        String str = null;
        try{
            int length = str.length();
            System.out.println("Length : "+length);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null reference : "+e.getMessage());
        }
    }
}
