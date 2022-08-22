package learn_java;

import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,k=1;
		
		System.out.println("Enter number to print table: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		do {
			System.out.println(num*k);
			k++;
		}
		while(k<=10);
		
	}

}
