package java101Projects;

import java.util.Scanner;

public class average_calculator {

	public static void main(String[] args) {
			
			//define Scanner class
			Scanner input = new Scanner(System.in);
			
			//create variables
			int math, phy, che, tur, hist, mus;

			
			//take readings from user
			System.out.println("Math grade: ");
			math = input.nextInt();
		
			System.out.println("Physics grade: ");
			phy = input.nextInt();
			
			System.out.println("Chemistry grade: ");
			che = input.nextInt();
			
			System.out.println("Turkish grade: ");
			tur = input.nextInt();
			
			System.out.println("History grade: ");
			hist = input.nextInt();
			
			System.out.println("Music grade: ");
			mus = input.nextInt();
			
			int sum = math + phy + che + tur + hist + mus;
			
			double average = sum/6;
			
			
			System.out.println("Your average grade is: " + average);
	}

}
