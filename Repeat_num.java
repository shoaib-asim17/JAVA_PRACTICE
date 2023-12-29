
import java.util.Scanner;

public class Repeat_num {
    
    public static void main(String[] args) {
        Scanner input_long_int = new Scanner(System.in);
        System.out.println("ENTER A LONG INT :: ");
        int buffer=input_long_int.nextInt();
        System.out.println("Select a number which is repeating in this :"+buffer);

        Scanner reptd_num = new Scanner(System.in);
        int selected_num = reptd_num.nextInt();

        int i=0;
        int count=0;
        int n=buffer;
        while(n!=0)
        {
            int store=n%10;
            if(store==selected_num)
            {
                count=count+1;
            }
            n=n/10;
        }
        System.out.print("number of repetition of a given number is : "+count);



    }
}
