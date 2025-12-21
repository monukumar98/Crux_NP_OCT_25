package Arrays_Assignment;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
	}

	public static int Circular_Sum(int[] arr) {
		int Linearsum = Kadanes_Algorithm(arr);
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] = arr[i] * -1;// sign change kra hu 
		}
		int middle_sum=Kadanes_Algorithm(arr);
		int circular_sum=total_sum+middle_sum;
		if(circular_sum==0) {
			return Linearsum;
		}
		return Math.max(circular_sum, Linearsum);
	}

	public static int Kadanes_Algorithm(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}
}
