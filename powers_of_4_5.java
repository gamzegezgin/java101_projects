package java101Projects;
import java.util.Scanner;

public class powers_of_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in); 
		
		System.out.println("Enter a limit value");
		int value = inputScanner.nextInt();
		
		
		for(int i=0; i<=value; i+=20) {
			
				System.out.println(i);
			
		}
}
}