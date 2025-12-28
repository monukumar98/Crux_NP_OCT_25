package Recursion_Doubt;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 60;
		int b = 36;

	}

	public static int HCF(int a, int b) {
		if (b == 0) {
			return a;
		}

		return HCF(b, a % b);
	}

}
