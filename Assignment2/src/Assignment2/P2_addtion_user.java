package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P2_addtion_user {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter the A value :");
		int a =Integer.parseInt(br.readLine());
		System.out.println("Enter the B value:");
		int b = Integer.parseInt(br.readLine());
		int c = a + b;
		System.out.println("Addition of A and B is : "+c);
		

	}

}
