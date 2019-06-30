/**
 * 
 */
package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class FrequencyOfCharorNO {

	
	public static void main(String[] args) throws IOException {
        String s="10011101101";
        String sub="1";
        int ind,count=0;
        for(int i=0; i+sub.length()<=s.length(); i++)    //i+sub.length() is used to reduce comparisions
        {
            ind=s.indexOf(sub,i);
            if(ind>=0)
            {
                count++;
                i=ind;
                ind=-1;
            }
        }
        System.out.println("Occurence of '"+sub+"' in String is "+count);
 
    }
}

