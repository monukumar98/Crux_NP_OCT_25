package Arrays_Assignment;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1 = 1;
		int c2 = 3;
		int c3 = 7;
		int c4 = 19;
		// n and m input then array
		int[] rickshaws = { 2, 5 };
		int[] cabs = { 4, 4, 4 };
		System.out.println(minimum_sum(rickshaws, cabs, c1, c2, c3, c4));

	}

	public static int minimum_sum(int[] rickshaws, int[] cabs, int c1, int c2, int c3, int c4) {
		int rickshaw_cost = 0;
		for (int i = 0; i < rickshaws.length; i++) {
			rickshaw_cost += Math.min(rickshaws[i] * c1, c2);
		}
		rickshaw_cost = Math.min(rickshaw_cost, c3);
		int cab_cost = 0;
		for (int i = 0; i < cabs.length; i++) {
			cab_cost += Math.min(cabs[i] * c1, c2);
		}
		cab_cost = Math.min(cab_cost, c3);
		return Math.min(rickshaw_cost + cab_cost, c4);
	}

}
