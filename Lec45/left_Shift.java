package Lec45;

public class left_Shift {
	public static void main(String[] args) {
		int n = 17;
		n <<= 2;// n = n<<2
		int n1 = -17;
		n1 <<= 2;// n1 = n1<<2
		System.out.println(n);
		System.out.println(n1);
		
		// right shift
		int a = 17;
		a >>= 1;
		int b = -20;
		b >>= 3;
		System.out.println(a);// 8 
		System.out.println(b);// -9
		
	}
}
