package JavaPgms;

public class ExceptioninJava {

	public static void main(String[] args) {
		try{
		System.out.println("statement 1");
		System.out.println(10/0);

	}
		catch(ArithmeticException e){
			//System.out.println("Exception found");
			e.printStackTrace();
			System.out.println("********");
			System.out.println(e.getMessage());
			
			System.out.println("#########");
			System.out.println(e);
			
			
		}

}
}
