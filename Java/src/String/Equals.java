package String;

public class Equals {

	public static void main(String[] args) {
		
		String x="Selenium";
		String y= new String("Testing");
		String z= new String("Automation");
		System.out.println(x==y);
		System.out.println(x.equals(y));
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(z));

	}

}
