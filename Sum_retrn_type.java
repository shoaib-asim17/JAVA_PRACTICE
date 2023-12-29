//program to implement function with retrun type 

import java.util.Scanner;


public class Sum_retrn_type 
{
    public static void main(String[] args)
     {
        for(int i=0;i<=5;i++)
        {
        int ans = sum();
        System.out.println("Sum of two numbers is : "+ans);
        }
    }



    static int sum()
    {
        Scanner in = new Scanner(System.in);

        System.out.print(" Enter first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter second number : ");
        int num2 = in.nextInt();
         int sum = num1+num2;
         return sum;
    }
}
