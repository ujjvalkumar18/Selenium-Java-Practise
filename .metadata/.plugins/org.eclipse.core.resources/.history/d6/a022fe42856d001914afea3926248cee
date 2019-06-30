package String;

import java.util.Scanner;

public class ReverseEachWordWithOutusingInbuiltFunction {

	static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
    }

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The string");
		String inputString=sc.nextLine();
		reverseEachWordOfString(inputString);
	}
}
