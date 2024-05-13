package java101Projects;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		double n1,n2;
		int select;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1 = input.nextDouble();
		
		System.out.println("Enter first number: ");
		n2 = input.nextDouble();
		
		System.out.println("Enter \n 1 for summary \n 2 for subtraction \n 3 for multiplication \n 4 for division" );
		select = input.nextInt();
		
		switch (select) {
		case 1: {
			System.out.println("Result: " + n1 + "+" + n2 + "=" + (n1+n2));
			break;
		}
		case 2: {
			System.out.println("Result: " + n1 + "-" + n2 + "=" + (n1-n2));
			break;
		}
		case 3: {
			System.out.println("Result: " + n1 + "+" + n2 + "*" + (n1*n2));
			break;
		}
		case 4: {
			if(n2!=0) {
				System.out.println("Result: " + n1 + "/" + n2 + "=" + (n1/n2));

			}else {
				System.out.println("Zero can not be a denominator.");
			}
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + select);
		}
		
		
	}

}
