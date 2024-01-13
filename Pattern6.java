import java.util.Scanner;

public class Pattern6 {
    

    
    public static void main(String[] args) {
        System.out.println("Enter the size of the pattern");
        Scanner in= new Scanner(System.in);
        int size=in.nextInt();
 
        patternfuction(size);
 
    }
     static void patternfuction(int size)
     {
         int row,col;
 
         for(row=1;row<=(2*size-1);row++)
         {
            int spaces;
            
            int totcoINrow= row>size ? 2*size - row   : row;
            
            int totalNOofSpaces= size-totcoINrow;
            for(spaces=1;spaces<=totalNOofSpaces;spaces++)
            {
                System.out.print(" ");
            }
                for(col=1;col<=totcoINrow;col++)
                {
                    System.out.print("* ");
                }

            
             System.out.println("");
         }
     }
}
/*
    
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
 */