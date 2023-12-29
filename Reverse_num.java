// program to reverse a given number

import java.util.Scanner;

public  class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
            int num=sc.nextInt();

            int reverse=0;
            while(num!=0)
            {
               int reminder= num%10;
                reverse=reverse*10+reminder;
              num=num/10;

            }
            System.out.print("reversed number is :  " +reverse);
        
    }
    
}
    

