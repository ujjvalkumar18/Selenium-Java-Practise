package String;


public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= "He is the one".split(" ");
	   String finalStr="";
	        for(int i = s.length-1; i>=0 ;i--){
	            finalStr=finalStr+s[i]+" ";
	        }
	       System.out.println(finalStr);
	    }	
}
