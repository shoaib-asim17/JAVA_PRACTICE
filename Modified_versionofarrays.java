//prograam which is modified version and the easiest version as well as consisting of non primitive data type example
import java.util.Arrays;
import java.util.Scanner;

public class Modified_versionofarrays{
    public static void main(String[] args) {
        System.out.println("Enter array of string limited upto 5");
        Scanner in=new Scanner(System.in);
        //String data=in.next();

        String[] str=new String[5];
        for(int i=0;i<str.length;i++)
        {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}