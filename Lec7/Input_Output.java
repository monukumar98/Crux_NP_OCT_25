package Lec7;

import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// array ka size
	//	int arr []= new int[n];
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Display(arr);
		System.out.println(arr[0]);
	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		arr[0]=-9;
		System.out.println();
	}

}
