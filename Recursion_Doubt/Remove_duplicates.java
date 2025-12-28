package Recursion_Doubt;

public class Remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbd";
		duplicates(s, "");

	}

	
	public static void duplicates(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		if (ans.length()==0 || ques.charAt(0) != ans.charAt(ans.length() - 1)) {
			ans = ans + ques.charAt(0);
		}
		duplicates(ques.substring(1), ans);
	}

}
