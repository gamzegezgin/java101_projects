package java101Projects;

import java.util.Scanner;

public class odd_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		
		int number;
		int sum=0;

		do {
			System.out.println("enter an integer");
			number = inputScanner.nextInt();
			if(number%2 == 1) {
				sum += number;
			}

		} while (number>=0);
		System.out.println(sum);
	}

}
