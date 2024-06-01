package java101Projects;

import java.util.Scanner;

public class power_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int result=1;
		
		System.out.println("integer: ");
		int number = input.nextInt();
		
		System.out.println("exponent: ");
		int exp = input.nextInt();

		for(int i=1; i<=exp; i++) {
			result*=number;
		}
		System.out.println("Result of "+number+" power of "+exp+" is equal: "+result);
	}

}
