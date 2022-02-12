package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P9_multi_table {

	public static void main(String[] args) throws Exception {
	      //Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	

	      System.out.println("Enter number to print a table :\n");

		int num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

	}

}
