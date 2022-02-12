package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.imageio.IIOException;

public class P6_palindrome {

	public static void main(String[] args)throws IOException {
	      //Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	

		int r,sum=0,temp;    
		System.out.println("Enter the number to check :\n");   
		  int n=Integer.parseInt(br.readLine()); 
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
			  System.out.println("not palindrome");

	}

}
