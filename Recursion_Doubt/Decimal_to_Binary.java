package Recursion_Doubt;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 65;
		System.out.println(Binary(n, 1, 0));

	}

	public static int Binary(int n, int mul, int sum) {
		if (n == 0) {
			return sum;
		}

		int rem = n % 2;
		return Binary(n / 2, mul * 10, sum + rem * mul);
	}

}
