//program to implement selection sort(swapping adjacent elements and traversing)
import java.util.Scanner;
public class SelectionSort
{
    public static void main(String[] args) {
        System.out.println("Enter size of an array :");
        Scanner sz=new Scanner(System.in);
        int size=sz.nextInt();

        int i;
        System.out.println("Enter array elements :");
        int[] arr= new int[size];
        Scanner in=new Scanner(System.in);
        for(i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("Array elements before sorting :");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Array elements after sorting are :");
        int temp,j;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[j]>arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("array elements after sorting :");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
         
        
    }
}