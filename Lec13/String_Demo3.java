package Lec13;

import java.util.Scanner;

public class String_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello" + 10 + 20 + "Bye");
		System.out.println(10 + 20 + "hello" + "Bye");
		System.out.println("hello" + (10 + 20) + "Bye");
		Scanner sc = new Scanner(System.in);
	//	char ch=sc.next().charAt(0);
		String s=sc.next();
	//	String s=sc.nextLine();
		System.out.println(s);
				

	}

}
