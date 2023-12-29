//parameter passing 

import java.util.Scanner;

public class Parapass {
    public static void main(String[] args) {
        
        int message = sum(20,30);
        System.out.println(message);

        String message2= greet(" shoaib asim");
        System.out.println(message2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String newString =sc.next();
        
        String latest = content(newString);
        System.out.println(latest);
        
        
        
    }



static int sum(int a, int b)
{
    int x= a+b;
    return x;
}

static String greet(String name){
    String sh ="hi"+name;
    return sh;


}
static String content(String str){
	String nstr=str;
	return nstr;
}
}

