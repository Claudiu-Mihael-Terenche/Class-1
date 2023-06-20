package Class1;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		Scanner CMT = new Scanner(System.in);
		
		String name = CMT.next();
		
		System.out.println("Your name is " + name);
		System.out.println("What is your family name?");
		
		String fn = CMT.next();
		
		System.out.println("Your family name is " + fn);
		
		System.out.println("What is your age?");
		int age = CMT.nextInt();
		System.out.println("your age is " + age);
		
		

	}

}
