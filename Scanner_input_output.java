package learn_java;

import java.util.Scanner;
public class Scanner_input_output {
	public static void main (String[] args) {
	
		int a,b,c;
		String z;
		System.out.println("enter two numbers:  ");
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		c= a+b;
		System.out.println("Sum of two entered number is " +c);
		
		//==============================================================================================//
		
		System.out.println("enter your name:");
		Scanner k = new Scanner(System.in);
		z = k.nextLine();
		System.out.println("My name is "+z);

		}
	}
