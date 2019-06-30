package String;

public class OccurenceOfCharacterInString {
	public static void main(String args[]){
		String s="My Name is Ujjwal";
		char c='j';
		int charcount=0;
		for(int i=0;i<s.length()-1;i++){
		if(s.charAt(i)==c)
		charcount++;
		}
		System.out.println(charcount);
	}

}
