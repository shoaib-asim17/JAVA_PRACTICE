import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        int i;
        System.out.println("enter the size of an array :");
        Scanner sz=new Scanner(System.in);
        int size=sz.nextInt();
        
        System.out.println("Enter array elements ;");
        Scanner in= new Scanner(System.in);

        int[] num=new int[size];
        

        for( i=0;i<size;i++)
        {
            
             num[i]=in.nextInt();
        }
        
                System.out.println("Enter the key element to be searched for :");
                Scanner sc = new Scanner(System.in);
                int key=sc.nextInt();
        
        
        int result= linearSearch( num, key);
        System.out.println("element found at "+result+" position");
    }
    static int linearSearch(int[] arr,int key)
    {
        if(arr.length==0)
        return -1 ;
        int index;
        for( index=0;index<=arr.length;index++)
        {
            int element = arr[index];
            if(element==key)
            {
                return index;
            }
        }
        return -1;
    }
    
}
