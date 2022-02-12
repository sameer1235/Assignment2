package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P3_calculator {

	public static void main(String[] args) throws Exception {
		char operator;
	    Double number1, number2, result;
	    
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	

	    Scanner input = new Scanner(System.in);

	    System.out.println("Choose any one option : 1.Addition , 2.substraction, 3.Multiplications, 4.Division");
	    operator = input.next().charAt(0);

	    
	    System.out.println("Enter first number");
	    number1 =Double.parseDouble(br.readLine());

	    System.out.println("Enter second number");
	    number2 = Double.parseDouble(br.readLine());


	    switch (operator) {

	      case '1':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      case '2':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case '3':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      case '4':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }


	}

}
