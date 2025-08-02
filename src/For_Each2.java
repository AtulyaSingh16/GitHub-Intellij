//2.summing array elements

public class For_Each2 {
    public static void main(String[] args) {
        int[] numbers={1,2,3};
        int sum=0;
        for(int num:numbers)
        {
            sum+=num;
        }
        System.out.println("Sum : "+sum);
    }
}
