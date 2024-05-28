package java101Projects;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		if(year%4==0) {
			System.out.println("Year that you enter is a leap year");
		}else{
			System.out.println("Year that you enter is NOT a leap year");
		}
	}

}
