package String;

public class GetSumOfNumFromGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123htrjjf98";
		int result=0;
		for(int i=0;i<s.length();i++){
			Character chars=s.charAt(i);
			
			if(Character.isDigit(chars)){
				//result=result+ Character.isDigit(chars);
				result=result+ Character.getNumericValue(s.charAt(i));
			}
			System.out.println(result);
		}
		
	}
}
