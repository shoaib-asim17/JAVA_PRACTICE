//program to check whether the given number is armshtrong number is  not 
//this program is applicable for only 3 digits numbers 
//as the digits are three power will also be going to  have three as the digits are increases in armstrong number power also increases ex 1634 1^4+6^4+3^4+4^4=1634

import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether the given number is armstrong or not :");

        Scanner in =new Scanner(System.in);
        int buf = in.nextInt(); //entered value is stored in the buf variable


        
        int x=buf; //storing the entered value in x because buf  value changes every time in the iteration and hence we cannot compare it in the below if statement
        
        int rem;  //initializing reminder results the last value in a given number 
       
        
       int temp=0; //cubic and sum value is stored in a temp variable and hence it is useful in comparison with x in the if stmt 
        while(buf !=0)
        {
        rem=buf%10;
         
            temp=(rem*rem*rem)+temp;
            


        buf=buf/10;
        }
        if(x==temp) //if it is armstrong numb ex 153 1^3+5^3+3^3 results in 153 it will print below stmts
        {
            System.out.println("given number is ARMSTRONG NUMBER ");
            System.out.println(temp);
        }
         else
         {
             System.out.println("NOT AN ARMSTRONG NUMBER "+temp);
         }
        
    }


    
}
