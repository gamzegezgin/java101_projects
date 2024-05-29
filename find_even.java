package java101Projects;

import java.util.Scanner;

public class find_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		int value = inputScanner.nextInt();
	
		for(int i=0; i<=value; i++) {
			if(i %2 == 1) {
				continue;
			}
			
			System.out.println(i);

		}

	}

}
