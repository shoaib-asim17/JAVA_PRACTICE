//program to implement first and last element's position

import java.util.Scanner;
public class FirstandLastElementInSortedArray {
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

        System.out.println("Enter target element");
        Scanner t=new Scanner(System.in);
        int target=t.nextInt();

        int[] result=FirstandLastElementInSortedArray_(num,target,size);
        System.out.println("the first and last position is "+result);
        
    }
    static int[] FirstandLastElementInSortedArray_(int[] arr,int target,int size)
    {
        int[] ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr, target, false);

        ans[0]=start;
        ans[1]=end;
        return ans;


    }

   static int search(int[] arr,int target,boolean findStartIndex)
   {
    
        int start=0;
        int end=arr.length;
        int mid;
        int ans=-1;
        
        while (start<=end) 
        {
            mid=(start+end)/2;

            if(target>mid)
            {
                start=mid+1;
            }
            else if (target<mid) 
            {
                end=mid-1;
                
            }
            else
            {
                ans=mid;
                if(findStartIndex==true)
                {
                    end=mid-1;
                }
                else
                    start=mid+1;
            }   
        }
        return ans;
   }
}
