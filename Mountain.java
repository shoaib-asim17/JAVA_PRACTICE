//program to implement peak element in a mountain array 

import java.util.Scanner;
public class Mountain {

         public static void main(String[] args) {
          int i;    
        System.out.println("Enter the size of an array :");
        Scanner sz=new Scanner(System.in);
        int size=sz.nextInt();

        System.out.println("Enter the array elements :");
        int[] num= new int[size];
        Scanner dt=new Scanner(System.in);
        for(i=0;i<size;i++)
        {
            num[i]=dt.nextInt();
        }
    

        int result=Peak_NUMBER(num);
        System.out.println("The Peak element in an array is "+result);



     }

     static int Peak_NUMBER(int[] arr)
     {
        int start=0;
        int end=arr.length -1;
        int mid;
        
        while(start < end)
        {
            mid=(start+end)/2;
            if(arr[mid] > arr[mid+1])
            {
                end=mid;
            }
             else //if(arr[mid] < arr[mid+1])
            {
                start=mid+1;

            }
           
        }
        return arr[start];
     }
}



