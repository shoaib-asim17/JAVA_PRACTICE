import java.util.Scanner;
public class Pattern2 {
    


    public static void main(String[] args) {
        System.out.println("Enter the size of the pattern");
        Scanner in= new Scanner(System.in);
        int size=in.nextInt();
 
        patternfuction2(size);
 
    }
     static void patternfuction2(int size)
     {
         int row,col;
 
         for(row=1;row<=size;row++)
         {
             for(col=1;col<=size;col++)
             {
                 System.out.print("* ");
             }
             System.out.println("");
         }
     }
    
}
