package JavaPgms;

public class MainMethodOverload {

	public static void main(String[] args) {
		//System.out.println("First Main Method");
		MainMethodOverload.main(5);
		MainMethodOverload.main(4,5);
}
	public static void main(int a) {
		System.out.println("Second Main Method");
}
	public static void main(int a,int b) {
		System.out.println("Third Main Method");
	}
		
}
