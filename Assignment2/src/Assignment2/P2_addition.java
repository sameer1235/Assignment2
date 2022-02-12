package Assignment2;

import java.util.Scanner;

public class P2_addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter value for a");
		a=sc.nextInt();
		System.out.println("Enter value for b");
		b=sc.nextInt();
		c=a+b;

		System.out.println("addition of A and B is : "+c);

	}

}
