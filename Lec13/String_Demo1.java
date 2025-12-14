package Lec13;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1 == s2);// address compare kr rahe hain
		System.out.println(s3 == s2);// address compare kr rahe hain
		System.out.println(s3 == s4);// address compare kr rahe hain
		System.out.println(s1.equals(s4));// Content compare kre rahe hain
		System.out.println(s1.length());
		int[] a = new int[6];
		System.out.println(a.length);

	}

}




