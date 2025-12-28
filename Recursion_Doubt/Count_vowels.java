package Recursion_Doubt;

public class Count_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";

	}

	public static int Countvowels(String s, int i) {
		if (i == s.length()) {
			return 0;
		}
		int c = 0;
		if (isvowels(s.charAt(i))) {
			c++;
		}
		return c + Countvowels(s, i + 1);

	}

	public static int Countvowels1(String s) {
		int c = 0;
		if (s.length() == 0) {
			return 0;
		}

		if (isvowels(s.charAt(0))) {
			c++;
		}
		return c + Countvowels1(s.substring(1));

	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
			return true;
		}
		return false;
	}

}
