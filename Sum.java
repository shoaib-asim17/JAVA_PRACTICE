//sum of two numbers using functions with out return type
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        
        sum();


    }

    static void sum(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1=in.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2=in.nextInt();
        int sum;
        sum=num1+num2;
        System.out.println("sum of two numbers is : "+sum);

    }
}
