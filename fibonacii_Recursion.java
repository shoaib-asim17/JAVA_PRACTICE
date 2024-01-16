import java.util.Scanner;

public class fibonacii_Recursion {

    public static void main(String[] args) {
        

        System.out.println("enter the limit value :");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();

        int result =fibonaci_Recursion(limit);
        System.out.println("the answer is :"+ result);
    }

    static int fibonaci_Recursion(int limit)
    {
        if(limit==0)
        {
            return 0;
        }
        else if (limit==1) {
            
            return 1;
        }

        else


        return fibonaci_Recursion(limit-1) + fibonaci_Recursion(limit-2);

    }
}