package Recursion_Doubt;

public class Count_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4 };

	}
	public static int count(int []arr,int i) {
		if(i==arr.length) {
			return 0;
		}
		
		int c=0;
		if(arr[i]%2==0) {
			c=1;
		}
		return c+count(arr, i+1);
	}
	public static int count1(int []arr,int i,int c) {
		if(i==arr.length) {
			return c;
		}
		
		
		if(arr[i]%2==0) {
			c++;
		}
		return count1(arr, i+1,c);
	}

}
