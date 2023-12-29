//program to implement linear search in a specified or given range
// if the key element is not found at a given range then the program returns -1 as an  answer
import java.util.Scanner;


public class Search_inRange_lin_ser {
    public static void main(String[] args) {
        
        System.out.println("Enter the size of an array :");
        Scanner sz= new Scanner(System.in);
        int size =sz.nextInt();

        int[] num=new int[size];
        System.out.println("Enter array elements :");
        Scanner in = new Scanner(System.in);
        int i;
         for(i=0;i<size;i++)
         {
            num[i]=in.nextInt();
         }

         System.out.println("enter the key element to be searched in a given range :");

         Scanner ky=new Scanner(System.in);
         int key=ky.nextInt();
          
         
         System.out.println("Enter the starting index of an array :");
         
         Scanner strt=new Scanner(System.in);
         int start= strt.nextInt();

         
         
         System.out.println("Enter the ending index of an array :");

         Scanner ed= new Scanner(System.in);
         int end =  ed.nextInt();

         int result= linearSearch_Range( num, key,start,end);
         System.out.println("element found at "+result+" position");

    }

    static int linearSearch_Range(int[] arr, int key, int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        int index;
        for(index=start;index<=end;index++)
        {

            int element=arr[index];
            if(element==key)
            {
                return index;
            }
        }
        return -1;
    }
}
