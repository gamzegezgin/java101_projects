package java101Projects;
import java.util.Scanner;

public class Circle_area_perimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write radius of circle in cm: ");
		// r yaricap
		double r = input.nextDouble();
		
		System.out.println("Write central angle: ");
		// alfa = merkez aci
		double alfa = input.nextDouble();
		
		double areaPart = (3.14*(r*r)*alfa)/360;
		
		//double area = Math.PI*r*r;
		//double perimeter = 2*Math.PI*r;
		
		System.out.println("Area is part of circle: " + areaPart);
	}

}
