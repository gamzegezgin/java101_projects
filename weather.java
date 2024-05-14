package java101Projects;
import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int degree;
		System.out.println("What is the temprature: ");
		degree = input.nextInt();
		
		if(degree<5) {
			System.out.println("Ski");
		}
			else if(degree<25){
				
				if (degree>=5 && degree <=15) {
					System.out.println("Cinema");
				}
				
				if(degree>=10 && degree<=25) {
					System.out.println("Picnic");
				}

		}
		else {
			System.out.println("Swim");
		}
	}

}
