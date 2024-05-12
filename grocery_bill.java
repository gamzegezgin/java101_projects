package java101Projects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class grocery_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double pear, apple, tomato, banana, aubergine;
		
		System.out.println("Weight of pears in kg: ");
		pear = input.nextDouble();
		System.out.println("Weight of apples in kg: ");
		apple = input.nextDouble();
		System.out.println("Weight of tomatos in kg: ");
		tomato = input.nextDouble();
		System.out.println("Weight of bananas in kg: ");
		banana = input.nextDouble();
		System.out.println("Weight of aubergine in kg: ");
		aubergine = input.nextDouble();
		
		double total = pear*2.14 + apple*3.67 + tomato*1.11 + banana*0.95 + aubergine*5 ;
		
		DecimalFormat df = new DecimalFormat("#.##");	
		String formattedTotal = df.format(total);
		
		System.out.println("Total payment: " + formattedTotal);
		

		
	}

}
