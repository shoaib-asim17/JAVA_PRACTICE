//program to implement minimum in 2d array
import java.util.Scanner;

public class Min_inTwodm_array {
    public static void main(String[] args) {
        System.out.println("Enter the size of a row(no of cols)");
        Scanner rz=new Scanner(System.in);
        int rowsize=rz.nextInt();

        System.out.println("Enter number of rows will be going to present in a matrix (no of rows):");
        Scanner nr=new Scanner(System.in);
        int nrows=nr.nextInt();


        int[][] num=new int[nrows][rowsize];
        System.out.println("Enter elements of a 2d array :");
        Scanner in= new Scanner(System.in);
        int r,c;
        for(r=0;r<nrows;r++)
        {
            for(c=0;c<rowsize;c++)
            {
                num[r][c]=in.nextInt();
            }

        }


        System.out.println("FORMED MATRIX IS :");
         for(r=0;r<nrows;r++)
        {
            for(c=0;c<rowsize;c++)
            {
              System.out.print(num[r][c]+" ");
            }
            System.out.println(" ");

        }

        int result=MINElement_array(num,rowsize,nrows);
        System.out.println("the minimum element in 2d array(Matrix) is :"+result);
    }
    static int MINElement_array(int[][] arr,int rowsize,int nrows)
    {
         if(arr.length==0)
         {
             return -1;
         }

        int min;
        min=arr[0][0];
         for(int ro=0;ro<nrows;ro++)
        {
            for(int co=0;co<rowsize;co++)
            {
              if(arr[ro][co]<min){
                min=arr[ro][co];
              };
            }
            
        }
        return min;


    }


}
