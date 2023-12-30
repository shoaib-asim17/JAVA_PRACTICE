//program to implement ceiling of a target value



import java.util.Scanner;
public class Ceiling {

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
        System.out.println("Enter the element to be searched for :");
        Scanner el=new Scanner(System.in);
        int element=el.nextInt();

        int result=Bineary_Search(num,element,size);
        System.out.println(" the ceiling value is "+result);



     }

     static int Bineary_Search(int[] arr, int e,int size)
     {
        int start=0;
        int end=arr.length -1;
        int mid;
        
        while(start <= end)
        {
            mid=(start+end)/2;
            if(e > arr[mid])
            {
                start=mid+1;
            }
            else if( e< arr[mid])
            {
                end=mid-1;
            }
            else {

                return arr[mid];
            }

        }
        return arr[start];
     }
}