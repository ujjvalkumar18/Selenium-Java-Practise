package String;

public class AddOnlyNoFromString {

	public static void main(String[] args) {
		String s="abcd123def45";
		String input=s.replaceAll("[^a-z]","");
		String s1=input.replaceAll("[4-5]","");
		String s2=input.replaceAll("[0-3]","");
		System.out.println(input);
		System.out.println(s1);
		System.out.println(s1);
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		System.out.println(n3);

	}

}
