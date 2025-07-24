//arithmetic exception
public class ExceptionalHandling1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result = a/b;
            System.out.println("The result is : "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divided by zero ! ");
        }
        finally{
            System.out.println("CleanUp complete ! ");
        }
    }
}
