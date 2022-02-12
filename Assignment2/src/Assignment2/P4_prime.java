package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P4_prime {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	

		
		System.out.println("Enter the A value :");
		int a = Integer.parseInt(br.readLine());
		 if(a%2==0)
			 System.out.println("number is not prime:"+a);
		 else
			 System.out.println("number is prime:"+a);
			 

	}

}
