package java101Projects;

import java.util.Scanner;

public class pass_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int gradeP, gradeM, gradeE, gradeH;	
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Physics: ");
	gradeP = input.nextInt();
	
	System.out.println("Math: ");
	gradeM = input.nextInt();

	System.out.println("English: ");
	gradeE = input.nextInt();

	
	System.out.println("History: ");
	gradeH = input.nextInt();

	
	if(gradeP<55) {
		System.out.println("Failed the Physics");
	}else {
		System.out.println("Passed the Physics");
	}
	if(gradeM<55) {
		System.out.println("Failed the Mathematics");
	}else {
		System.out.println("Passed the Mathematics");
	}
	if(gradeE<55) {
		System.out.println("Failed the English");
	}else {
		System.out.println("Passed the English");
	}
	if(gradeH<55) {
		System.out.println("Failed the History");
	}else {
		System.out.println("Passed the History");
	}

		
	}

}
