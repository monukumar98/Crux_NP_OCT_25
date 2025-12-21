package Arrays_Assignment;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int x = sc.nextInt();
			arr = Update_Array(arr, x);

		}
		long ans = 0;
		int mod = 1000_000_007;
		for (int i = 0; i < arr.length; i++) {
			ans = (ans + arr[i]) % mod;
		}
		System.out.println((int) (ans));

	}

	public static int[] Update_Array(int[] arr, int x) {
		// TODO Auto-generated method stub
		int [] a= new int [arr.length];
		for (int i = 0; i < a.length; i++) {
			int j=i-x;
			if(j<0) {
				j+=arr.length;
			}
			a[i]=arr[i]+arr[j];
		}
		return a;

	}

}





