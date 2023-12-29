//program to implement min element in array

import java.util.Scanner;
public class MinElement_array {

    public static void main(String[] args) {

        System.out.println("Enter the size of an array :");
        Scanner sz=new  Scanner(System.in);
        int size= sz.nextInt();

        System.out.println("Enter array elements :");
        Scanner in = new Scanner(System.in);
        int[] num=new int[size];
        int i;
        for(i=0;i<size;i++)
        {
            num[i]=in.nextInt();
        }

        int result= MinElementArray(num);
        System.out.println("minimum element in an array is "+result);
    }
    static int MinElementArray(int[] arr)
    {
        int min;
        // if(arr.length==0)
        // {
        //     return -1;
        // }
         min=arr[0];
        int index;
        for( index=1;index<=arr.length;index++)
        {
            if(arr[index]<min)
            {
                min=arr[index];
            }

        }
        return min;

    }
    
}
