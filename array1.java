//program to implement array initialization

import java.util.Scanner;
import java.util.*;

public class array1 {
    public static void main(String[] args) {

        int i;
        System.out.println("Enter the size of an array : ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

      //  int[] arr = new int[size];

            System.out.println("Enter array elements : ");
        Scanner arr_in=new Scanner(System.in);
        int[] arr_data=new int[size];
        for(i=0;i<size ;i++)
        {
         arr_data[i]=arr_in.nextInt();
        }

       
        System.out.println("Entered elements in an array are :");
        for(i=0;i<size;i++)
        {
            System.out.print(arr_data[i]+" " );
        }

        System.out.println();
        //another way of writing code for array is as follows which is the easiest one among all of the ways
       System.out.println("Another way of doing arrays :");
        System.out.println(Arrays.toString(arr_data));
    }
    
}
