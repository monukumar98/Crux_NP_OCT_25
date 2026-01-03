package Lec16;

public class Print_Subsequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Subsequnce(s, "");

	}

	public static void Subsequnce(String s, String ans) {
		// TODO Auto-generated method stub
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = s.charAt(0);
		Subsequnce(s.substring(1), ans);
		Subsequnce(s.substring(1), ans + ch);

	}

}
