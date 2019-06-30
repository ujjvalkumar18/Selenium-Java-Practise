package String;

public class OnlyIntegersFromStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ujjwal123456Arun";
		String number=s.replaceAll("[^0-9]","");
		System.out.println("Intgers extracted from the given string: "+ number);
		String words=s.replaceAll("[^A-Z]", "");
		System.out.println("Words Extracted from the given String: "+ words);

	}

}
