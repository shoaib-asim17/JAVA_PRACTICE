//program to implement two dimensional array 

import java.util.Scanner;

public class Two_d_array {
    public static void main(String[] args) {
        System.out.println("Enter array elements :");
        Scanner in = new Scanner(System.in);

        int[][] arr= new int[3][];

        int row ,col;
        for(row=0;row<arr.length ;row++)
        {
            for(col=0;col<(arr[row]).length;col++)
            {
                arr[row][col]=in.nextInt();
            }
        }
         
        for(row=0;row<arr.length ;row++)
        {
            for(col=0;col<arr[row].length;col++)
            {
                  System.out.println(arr[row][col]); 
            }
        }

    }
}
