package Lec16;

public class Count_Subsequnce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println("\n" +Subsequnce(s, ""));
		// System.out.println("\n" + c);

	}

	public static int Subsequnce(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		char ch = ques.charAt(0);
		int f = Subsequnce(ques.substring(1), ans);
		int s = Subsequnce(ques.substring(1), ans + ch);
		return f + s;

	}

//	static int c = 0;
//
//	public static void Subsequnce(String s, String ans) {
//		// TODO Auto-generated method stub
//		if (s.length() == 0) {
//			System.out.print(ans + " ");
//			c++;
//			return;
//		}
//
//		char ch = s.charAt(0);
//		Subsequnce(s.substring(1), ans);
//		Subsequnce(s.substring(1), ans + ch);
//
//	}
}
