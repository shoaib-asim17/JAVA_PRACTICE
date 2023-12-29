
//program to implement sum of two numbers using methods and functions

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int ans=sum();
	    System.out.println("sum of two numbers is ::"+ans);
	}
	 static int sum(){
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter number 1: ");
	     int num1=sc.nextInt();
	     
	     System.out.println("enter number 2: ");
	     int num2=sc.nextInt();
	     
	     return num1+num2;
	 }
	
	
}
