package java101Projects;

import java.util.Scanner;

public class taximeter_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Write distance in km: ");
		
		double km;
		
		km = input.nextDouble();
		
		
		double payment = 10 + 2.20*km;
		
		payment = (payment < 20) ? 20 : payment;
		
		System.out.println("Payment: " + payment);
	}

}
