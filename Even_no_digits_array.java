//program to implement number of even number of digits in an 1d array

import java.util.Scanner;

public class Even_no_digits_array {
    public static void main(String[] args) {
        System.out.println("INPUT ARRAY SIZE :");
        Scanner sz= new Scanner(System.in);
        int size= sz.nextInt();


        System.out.println("Enter array elements :");
        Scanner in = new Scanner(System.in);
        int[] num= new int[size];
        int i;

        for(i=0;i<size;i++)
        {
            num[i]=in.nextInt();
        }

        int result=NoOfEven_digits(num, size);
        System.out.println("Number of even digits in an array are :"+result);

    }

//     static int NoOfEven_digits(int[] arr,int size)
//     {
//         int ans=0;
//         int count=0;
//         for(int index=0;index<size;index++)
//         {
//            int n=arr[index];
//             while(n!=0)
//             {
//                 int r= n%10;
//                 count=count+1;
//                 n=n/10;
//             }
//             if(count%2==0)
//             {
//                 ans=ans+1;
//             }
//         }
//         return ans;
//     }
// }
