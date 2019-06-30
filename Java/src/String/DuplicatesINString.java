package String;

public class DuplicatesINString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		int count = 0;
		char[] ip = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ip[i] == ip[j]) {
					System.out.println(ip[j]);
					count++;
				}
			}

		}

	}
}
