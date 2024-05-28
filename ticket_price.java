package java101Projects;

import java.util.Scanner;

public class ticket_price {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	
		
		System.out.println("Enter distance in kilometer");
		int distance = input.nextInt();

		System.out.println("How old are you");
		int old = input.nextInt();
		
		System.out.println("Enter the trip type\n 1: one way ticket \n 2: round trip ticket ");
		int type = input.nextInt();
		
		double total = 0.1*distance;
		double discount=0;
		

		
		if(old<12) {
			discount = total*(0.5);
	}else if(old>=12 && old<=24) {
		discount = total*(0.1); 
	}else if(old>=65) {
		discount = total*(0.3);
	}
		total=total-discount;
				
		if(type==2) {
			total = total * 2 * 0.8;
		}else if(type==1) {
			total=total;
		}else {
			System.out.println("invalid type, just select 1 or 2");
		}
		System.out.println(total);
		if(distance<0) {
			System.out.println("Enter valid distance");
		}
		input.close();
		
	}

}