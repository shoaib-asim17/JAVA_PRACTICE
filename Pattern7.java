import java.util.Scanner;

public class Pattern7 {
    

     
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
            int spaces;
            
            for(spaces=1;spaces<=size-row;spaces++)
            {
                System.out.print(" ");
            }
            
            for(col=row;col>=1;col--)
            {
                System.out.print(col);
            }
            for(col=2;col<=row;col++)
            {
                System.out.print(col);
            }

            
            System.out.println("");
        }
     }
}
