package String;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String args[])
	   {
	      int n, reverse = 0;
	    Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number to reverse");
	      
	      n = sc.nextInt();
//	      int num=789;
	 
	      while(n != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of the number is " + reverse);
	   }
	

	}



