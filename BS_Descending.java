//program to implement binary search in a descending order

import java.util.Scanner;
public class BS_Descending {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array :");
        Scanner sz=new Scanner(System.in);
        int size=sz.nextInt();
         
        int i; 

        System.out.println("Enter array elements :");
        int[] num= new int[size];
        Scanner in=new Scanner(System.in);
        for(i=0;i<size;i++)
        {
            num[i]=in.nextInt();
        }

        System.out.println("Enter the element to be searched for :");
        Scanner dt=new Scanner(System.in);
        int element= dt.nextInt();

        int result=B_S_Descending(num,element,size);
        System.out.println("element is found at "+result+" position");

    }

    static int B_S_Descending(int[] arr,int element,int size)
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(element<arr[mid])
            {
                start=mid+1;
            }
            else if(element>arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
}
//for order agnostic refer 53:46 14lecture