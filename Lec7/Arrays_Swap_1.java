package Lec7;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 7 };
		// int[] arr1 = new int []{ 2, 3, 4, 5, 7 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}

}
