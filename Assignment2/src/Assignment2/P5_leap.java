package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P5_leap {

	public static void main(String[] args) throws IOException  {
		 int year;
	      System.out.println("Enter an Year : ");
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	

	      //Scanner sc = new Scanner(System.in);
	      year = Integer.parseInt(br.readLine());

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   }

}
