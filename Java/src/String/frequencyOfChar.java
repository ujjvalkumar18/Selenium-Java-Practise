package String;

public class frequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		int[] freq = new int[s.length()];
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					freq[i]++;
					c[j] = '0';

				}
			}

		}
		System.out.println("Characters and their corresponding frequencies");
		for (int i = 0; i < freq.length; i++) {
			if (c[i] != ' ' && c[i] != '0')
				System.out.println(c[i] + "-" + freq[i]);
		}
	}

}
