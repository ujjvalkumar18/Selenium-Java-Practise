package String;

public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Beginners fg Book";
		String reverse="";
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse of String---- "+reverse);		
	}
}
