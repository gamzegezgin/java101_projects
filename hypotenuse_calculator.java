package java101Projects;
import java.util.Scanner;

public class hypotenuse_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Enter the first side of right triangle: ");
		a = input.nextDouble();		
		
		System.out.println("Enter the second side of right triangle: ");
		b = input.nextDouble();

		
		double c = Math.sqrt(a*a + b*b);
		
		System.out.println("Hypotenuse is: " + c);
		

	}

}
