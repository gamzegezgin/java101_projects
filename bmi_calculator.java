package java101Projects;

import java.util.Scanner;

public class bmi_calculator {

	public static void main(String[] args) {

		double height,weight ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in kg: ");
		weight = input.nextDouble();
		
		System.out.println("Enter height in m: ");		
		height = input.nextDouble();

		double bmi = weight/(height*height);
		
		System.out.println("BMI: " + bmi);		
		
				
	}

}
