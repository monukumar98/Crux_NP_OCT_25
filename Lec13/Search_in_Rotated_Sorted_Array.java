package Lec13;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(Search(arr, target));
	}

	public static int Search(int[] arr,int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[lo]<=arr[mid]) {// mid mera upper line pe hai 
				if(arr[lo]<=item && arr[mid]>item) {
					hi=mid-1;
				}
				else {
					lo=mid+1;
				}
			}
			else {// lower line  pe hai 
				if(arr[mid]<item && arr[hi]>=item) {
					lo=mid+1;
				}
				else {
					hi=mid-1;
				}
				
			}
		}
		return -1;

	}
}










