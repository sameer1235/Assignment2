package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P8_sort {

	public static void main(String[] args) throws Exception {
        int n;
        String temp;
        //Scanner s = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	

        System.out.print("Enter number of names you want to enter:");
        n = Integer.parseInt(br.readLine());
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:\n");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(names[i] + "\n");
        }
        System.out.print(names[n - 1]);
    

	}

}
