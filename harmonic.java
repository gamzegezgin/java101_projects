package java101Projects;

import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		double sum = 0.00;
		for(int i=1; i<=n; i++) {
		
			sum += 1.0/i;
		}
		System.out.println("Result: "+ sum);
	}

}
