
import java.util.Scanner;
public class Pattern4 {
    


    public static void main(String[] args) {
        System.out.println("Enter the size of the pattern");
        Scanner in= new Scanner(System.in);
        int size=in.nextInt();
 
        patternfuction(size);
 
    }
     static void patternfuction(int size)
     {
         int row,col;
 
         for(row=1;row<=size;row++)
         {
             for(col=1;col<=row;col++)
             {
                // for(int i=1; i<=row;i++)
                // {
                //     System.out.print(i+" ");
                // }
                System.out.print(col);
            }
            System.out.println("");
         }
    }
     

}
/*
6
1
12
123
1234
12345
123456 */
    


