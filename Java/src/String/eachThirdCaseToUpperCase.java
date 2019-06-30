package String;

import java.util.Scanner;

public class eachThirdCaseToUpperCase {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner in = new Scanner(System.in);
		String inputStr = in.nextLine();
		String [] chars = inputStr.split("");
		String outputStr = "";
		for(int i=0;i<chars.length;i++){
			if(i%3==0){
				outputStr=outputStr+chars[i].toUpperCase();
			}
			else{
				outputStr = outputStr + chars[i].toLowerCase();
			}
			
		}
			
	System.out.println("String With Each third Character as Upper case: " +outputStr);		
		}

	}


