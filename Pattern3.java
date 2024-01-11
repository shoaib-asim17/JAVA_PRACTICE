import java.util.Scanner;

public class Pattern3 {
    


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
             for(col=1;col<=size-row+1;col++)
             {
                 System.out.print("* ");
             }
             System.out.println("");
         }
     }
    

}
